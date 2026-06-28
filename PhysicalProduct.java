// Pranish Khanal, Physical Product
public class PhysicalProduct extends Product implements Taxable {
    // Specific variables only used for physicals
    private double shippingWeight;
    private double shippingCost;
    private int stock;
    // Constructor
    public PhysicalProduct(int productID, String productName,double price, double shippingWeight,double shippingCost,int stock){
        super(productID, productName, price); //sends to product superclass
        this.shippingWeight = shippingWeight;
        this.shippingCost = shippingCost;
        this.stock = stock;
    }

    // Getter methods
    public double getShippingWeight() {
        return shippingWeight;
    }
    public double getShippingCost() {
        return shippingCost;
    }
    public int getStock() {
        return stock;
    }


    @Override
    public double calculateTax() { //from the interface
        return price * 0.07; //7% tax

    }
}