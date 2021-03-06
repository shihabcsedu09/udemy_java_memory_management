package chapter7.badexample;

import chapter7.Customer;

import java.util.HashMap;
import java.util.Map;

class CustomerRecords {
    private Map<String, Customer> customerRecords;

    CustomerRecords() {
        this.customerRecords = new HashMap<String, Customer>();
    }

    void addCustomer(Customer customer) {
        this.customerRecords.put(customer.getName(), customer);
    }

    Map<String, Customer> getCustomers() {
        return this.customerRecords;
    }
}
