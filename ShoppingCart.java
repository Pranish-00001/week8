// Pranish Khanal
//Shopping Cart

import java.util.ArrayList;
public class ShoppingCart {
    // ArrayList
    private ArrayList<Product> cart = new ArrayList<>();
    // Method for adding products

    public void addProduct(Product p) throws OutOfStockException { // Add product method
        if (p instanceof PhysicalProduct) { // Check product type
            if (((PhysicalProduct) p).getStock() == 0) {// Check available stock(nested if)
                throw new OutOfStockException("Sorry! This product is currently out of stock."); // Throw custom exception
            }
        }
        cart.add(p); //else adds
    }

    // Method to display billing
    public void checkout() {
        double total = 0;
        System.out.println("\n--------------- BILL ---------------");
        for (Product item : cart) { //for each loop
            Taxable taxableItem = (Taxable) item; //Converting the current product into a Taxable object so that we can calculate its tax
            double tax = taxableItem.calculateTax();//calculating tax
            double finalPrice = item.getPrice() + tax; //Add the product price and the calculated tax to get the final amount

            System.out.println("\nProduct ID : " + item.getProductID());
            System.out.println("Product Name : " + item.getProductName());
            System.out.println("Price : $" + item.getPrice());
            System.out.println("Tax : $" + tax);
            System.out.println("Total : $" + finalPrice);
            total += finalPrice;
        }
        System.out.println("\n-----------------------------");
        System.out.println("Grand Total -: $"+ total);
    }
}