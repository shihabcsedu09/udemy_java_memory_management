package chapter7.badexample;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Customer 1");
        Customer c2 = new Customer("Customer 2");

        CustomerRecords customerRecords = new CustomerRecords();
        customerRecords.addCustomer(c1);
        customerRecords.addCustomer(c2);

        customerRecords.getCustomers().clear();

        for (Customer customer : customerRecords.getCustomers().values()) {
            System.out.println(customer.getName());
        }

    }
}
