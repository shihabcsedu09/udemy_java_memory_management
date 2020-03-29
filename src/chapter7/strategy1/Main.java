package chapter7.strategy1;

import chapter7.Customer;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Customer 1");
        Customer c2 = new Customer("Customer 2");

        CustomerRecords customerRecords = new CustomerRecords();
        customerRecords.addCustomer(c1);
        customerRecords.addCustomer(c2);


        for (Customer customer : customerRecords) {
            System.out.println(customer.getName());
        }

        Iterator<Customer> iterator = customerRecords.iterator();
        iterator.next();
        iterator.remove();

        for (Customer customer : customerRecords) {
            System.out.println(customer.getName());
        }


    }
}
