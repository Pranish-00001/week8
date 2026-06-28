// Pranish Khanal
// E-Commerce Simulator
//Main class
public class ECommerceSimulator {
    public static void main(String[] args) { //main method
        // Creating a shopping cart
        ShoppingCart cart = new ShoppingCart();
        // Creating a customer
        Customer customer = new Customer("Pranish","Khanal","pranish@gmail.com",AccountStatus.ACTIVE); //feeding constructor

        // Creating physical products
        PhysicalProduct laptop = new PhysicalProduct(101,"Gaming Laptop",1800, 2.5,50,5);
        PhysicalProduct monitor = new PhysicalProduct(102, "4K Monitor", 500,4.2,30,0);

        // Creating digital products
        DigitalProduct ebook = new DigitalProduct(201, "Java Programming E-Book",40,"www.downloadjava.com");
        DigitalProduct course = new DigitalProduct(202, "Java Masterclass",120,"www.javacourse.com");
        try {//error handling
            // Adding products into cart
            cart.addProduct(laptop);
            cart.addProduct(monitor);   // Will throw exception (out of stock)
            cart.addProduct(ebook);
            cart.addProduct(course);
        } catch (OutOfStockException e) {
            // Display the error
            System.out.println(e.getMessage());
        }
        // Display final bill
        cart.checkout();
    }
}