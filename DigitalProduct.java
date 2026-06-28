// Pranish Khanal, Digital Product
public class DigitalProduct extends Product implements Taxable {
    //digital product specific variable
    private String downloadLink;
    // Constructor
    public DigitalProduct(int productID,String productName, double price,String downloadLink){
        super(productID, productName, price); //sending to product superclass
        this.downloadLink = downloadLink;
    }
    //getter
    public String getDownloadLink() {
        return downloadLink;
    }

    @Override
    public double calculateTax() {
        return price * 0.02;//2% tax

    }
}