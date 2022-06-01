import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counterNumber = new Counter();
		
		System.out.println("Count:" + counterNumber.getCount());
		
		counterNumber.increment();
		
		System.out.println("Count:" + counterNumber.getCount());
		
		counterNumber.decrement();
		
		System.out.println("Count:" + counterNumber.getCount());
		
	}

}
