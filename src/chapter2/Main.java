package chapter2;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("starting the work...");
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
	}

}
