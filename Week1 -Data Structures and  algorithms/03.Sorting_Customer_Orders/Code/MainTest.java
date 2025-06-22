public class MainTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 150.50),
            new Order(102, "Bob", 99.99),
            new Order(103, "Charlie", 200.00),
            new Order(104, "David", 50.25)
        };

        System.out.println("Before Bubble Sort:");
        printOrders(orders);

        SortOrders.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        printOrders(orders);

        orders = new Order[]{
            new Order(101, "Alice", 150.50),
            new Order(102, "Bob", 99.99),
            new Order(103, "Charlie", 200.00),
            new Order(104, "David", 50.25)
        };

        System.out.println("\nBefore Quick Sort:");
        printOrders(orders);

        SortOrders.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        printOrders(orders);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
