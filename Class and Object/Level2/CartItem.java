class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }
}

class ShoppingCart {
    java.util.ArrayList<CartItem> items = new java.util.ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayCart() {
        double totalCost = 0;
        System.out.println("--- Shopping Cart ---");
        for (CartItem item : items) {
            item.displayItem();
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 800.0, 1));
        cart.addItem(new CartItem("Mouse", 25.0, 2));
        cart.displayCart();
        cart.removeItem("Mouse");
        cart.displayCart();
    }
}
