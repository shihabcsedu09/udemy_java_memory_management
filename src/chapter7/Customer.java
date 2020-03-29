package chapter7;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer c) {
        this.name = c.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
