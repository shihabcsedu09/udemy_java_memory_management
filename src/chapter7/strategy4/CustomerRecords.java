package chapter7.strategy4;

import chapter7.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> customerRecords;

    CustomerRecords() {
        this.customerRecords = new HashMap<>();
    }

    void addCustomer(Customer customer) {
        this.customerRecords.put(customer.getName(), customer);
    }

    Map<String, Customer> getCustomers() {
        return Map.copyOf(customerRecords);
    }

    @Override
    public Iterator<Customer> iterator() {
        return this.customerRecords.values().iterator();
    }

    public Customer getCustomerByName(String name) {
        return new Customer(this.customerRecords.get(name));
    }


}
