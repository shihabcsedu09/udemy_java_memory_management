package chapter7.strategy3;

import chapter7.Customer;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Customer 1");
        Customer c2 = new Customer("Customer 2");

        CustomerRecords customerRecords = new CustomerRecords();
        customerRecords.addCustomer(c1);
        customerRecords.addCustomer(c2);
        customerRecords.getCustomers().clear();


    }
}
