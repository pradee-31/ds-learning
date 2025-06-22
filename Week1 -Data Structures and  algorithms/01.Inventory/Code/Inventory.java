import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Products> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(Products product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(int productId, String name, int quantity, double price) {
        Products product = products.get(productId);
        if (product != null) {
            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayInventory() {
        for (Products product : products.values()) {
            System.out.println("ID: " + product.getProductId() +
                               ", Name: " + product.getProductName() +
                               ", Quantity: " + product.getQuantity() +
                               ", Price: " + product.getPrice());
        }
    }
}
