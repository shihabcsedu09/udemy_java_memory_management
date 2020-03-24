package chapter7.badexample;

import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {
    private Map<String, Customer> customerRecords;

    public CustomerRecords() {
        this.customerRecords = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer customer) {
        this.customerRecords.put(customer.getName(), customer);
    }

    public Map<String, Customer> getCustomers() {
        return this.customerRecords;
    }
}
