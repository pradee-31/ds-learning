
public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mouse", "Accessories"),
            new Product(3, "Keyboard", "Accessories"),
            new Product(4, "Monitor", "Electronics")
        };

        Product foundLinear = Search.linearSearch(products, "Mouse");
        System.out.println("Linear Search: " + (foundLinear != null ? foundLinear.getProductName() : "Not Found"));

        Search.sortProductsByName(products);

        Product foundBinary = Search.binarySearch(products, "Mouse");
        System.out.println("Binary Search: " + (foundBinary != null ? foundBinary.getProductName() : "Not Found"));
    }
}
