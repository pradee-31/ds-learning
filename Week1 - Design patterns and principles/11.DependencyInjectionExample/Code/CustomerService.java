public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void findAndDisplayCustomer(String customerId) {
        String customer = customerRepository.findCustomerById(customerId);
        System.out.println("Found: " + customer);
    }
}
