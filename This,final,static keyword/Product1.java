public class Product1 {
    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    public Product1(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductDetails() {
        if (this instanceof Product1) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void main(String[] args) {
        Product1 prod1 = new Product1("Laptop", 800, 1, 2001);
        Product1 prod2 = new Product1("Mouse", 20, 2, 2002);

        prod1.displayProductDetails();
        prod2.displayProductDetails();

        Product1.updateDiscount(15.0);
        System.out.println("\nAfter discount update:");
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
