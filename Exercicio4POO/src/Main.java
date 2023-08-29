// Importing necessary packages and classes
import Exercicio4POO.Invoice; // Import the Invoice class from the Exercicio4POO package
import java.util.Scanner;

/**
 * The Main class allows users to register sales and calculate total invoice amounts.
 */
public class Main {

    /**
     * The main method that initiates the program.
     *
     * @param args The command line arguments (unused in this program)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean finished = false;

        // Display initial options to the user
        System.out.println("What would you like to do?");
        System.out.println("1 - Register a new sale");
        System.out.println("2 - Exit");
        int option = scan.nextInt();

        // Loop until the user decides to exit
        while (finished !=true) {

            if (option == 2) {
                finished = true;
                System.out.println("End!");
            } else if (option == 1) {

                // Requesting user data
                System.out.println("  ");
                System.out.println("Enter the product code:");
                int code = scan.nextInt();
                System.out.println("What is the product description?");
                scan.nextLine();
                String description = scan.nextLine();
                System.out.println("How many of this product were purchased?");
                int quantity = scan.nextInt();
                System.out.println("What is the unit value of this product?");
                float value = scan.nextFloat();

                // Creating an instance of the Invoice class
                Invoice inv = new Invoice(code, description, quantity, value);

                // Checking the calculation choice
                System.out.println("  ");
                System.out.println("Do you want to calculate the total invoice amount?");
                System.out.println("1 - Yes");
                System.out.println("2 - No");
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("  ");
                        System.out.printf("Total sale amount is $%.2f \n", inv.getInvoiceAmount());
                        break;
                    default:
                        break;
                }

                // Checking if the program should end or start again
                System.out.println("  ");
                System.out.println("Do you wish to register a new sale?");
                System.out.println("1 - Yes");
                System.out.println("2 - No, I wish to exit");
                option = scan.nextInt();
                System.out.println("  ");
            }
        }
    }
}
