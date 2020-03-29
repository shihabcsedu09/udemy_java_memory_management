package chapter7.strategy1;

import chapter7.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> customerRecords;

    CustomerRecords() {
        this.customerRecords = new HashMap<String, Customer>();
    }

    void addCustomer(Customer customer) {
        this.customerRecords.put(customer.getName(), customer);
    }

    @Override
    public Iterator<Customer> iterator() {
        return this.customerRecords.values().iterator();
    }
}
