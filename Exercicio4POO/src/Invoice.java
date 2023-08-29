package Exercicio4POO;

public class Invoice {

    // Declaration of class variables
    private int itemCode;
    private String description;
    private int quantity;
    private float unitPrice;

    // Class constructor
    public Invoice(int itemCode, String description, int quantity, float unitPrice) {
        this.setItemCode(itemCode);
        this.setDescription(description);
        this.setQuantity(quantity);
        this.setUnitPrice(unitPrice);
    }

    public double getInvoiceAmount() {
        return quantity * unitPrice;
    }

    // Getter and Setter methods

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        // Checking if the quantity is less than 0,
        // if true, automatically set to 0
        // otherwise, record the value provided by the user.
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        // Checking if the unit price is less than 0,
        // if true, automatically set to 0
        // otherwise, record the value provided by the user.
        if (unitPrice < 0) {
            this.unitPrice = 0;
        } else {
            this.unitPrice = unitPrice;
        }
    }
}
