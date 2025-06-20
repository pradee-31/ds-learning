public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String customerId) {
        // Mock: Return dummy customer info
        return "Customer[ID=" + customerId + ", Name=Nivetha]";
    }
}
