public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement(5);

        management.addEmployee(new Employee(1, "Alice", "Manager", 75000.0));
        management.addEmployee(new Employee(2, "Bob", "Developer", 60000.0));
        management.addEmployee(new Employee(3, "Charlie", "Designer", 50000.0));

        System.out.println("All Employees:");
        management.displayAllEmployees();

        System.out.println("\nSearching for Employee ID 2:");
        Employee found = management.searchEmployee(2);
        System.out.println(found != null ? found : "Not found.");

        System.out.println("\nDeleting Employee ID 2:");
        management.deleteEmployee(2);

        System.out.println("\nAll Employees after deletion:");
        management.displayAllEmployees();
    }
}
