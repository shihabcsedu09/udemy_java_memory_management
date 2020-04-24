package chapter12;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class CustomerManager {

	private List<Customer> customers = new ArrayList<Customer>();
	private int nextAvalailbleId = 0;
	
	public  void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(nextAvalailbleId);
			synchronized(customers) {
				customers.add(customer);
			}
			nextAvalailbleId++;
		}

	}

	public Optional<Customer> getNextCustomer() {
		synchronized(customers) {
				if (customers.size() > 0) {
					System.out.println("Removing from queue. " + customers.get(0).toString());
					return Optional.of(customers.get(0));
				}
		}
		return Optional.empty();
	}	

	public void howManyCustomers() {
		int size = 0;
		size = customers.size();
		System.out.println("" + new Date() + " Customers in queue : " + size + " of " + nextAvalailbleId);
	}

}
