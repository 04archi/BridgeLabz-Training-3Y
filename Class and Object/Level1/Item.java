class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayItemDetails(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
    }

    public static void main(String[] args) {
        Item item = new Item("ITM001", "Keyboard", 25.50);
        item.displayItemDetails(4);
    }
}
