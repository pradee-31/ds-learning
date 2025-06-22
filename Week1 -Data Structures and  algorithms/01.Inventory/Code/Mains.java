public class Mains {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addProduct(new Products(1, "Laptop", 10, 750.0));
        inventory.addProduct(new Products(2, "Mouse", 50, 20.0));

        inventory.updateProduct(1, "Gaming Laptop", 8, 900.0);

        inventory.deleteProduct(2);

        inventory.displayInventory();
    }
}
