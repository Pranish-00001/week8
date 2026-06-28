// Pranish Khanal, Product Superclass

public abstract class Product {

    //All common variables
    protected int productID;
    protected String productName;
    protected double price;

    // Constructors
    public Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    // Getter methods
    public int getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
}