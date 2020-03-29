package chapter7.strategy3;

import chapter7.Customer;

import java.util.Collections;
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

    Map<String, Customer> getCustomers() {
        return Map.copyOf(customerRecords);
//        return Collections.unmodifiableMap(customerRecords);
    }

    @Override
    public Iterator<Customer> iterator() {
        return this.customerRecords.values().iterator();
    }
}
