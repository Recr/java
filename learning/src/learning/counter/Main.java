package learning.counter;

public class Main {
	public static void main(String [] args) {
		Counter counter = new Counter();
		
		
		for(int i = 0; i < 10; i++)
			counter.counterIncrement();
		
		System.out.println(counter.getCounter());
		counter.counterReset();
		System.out.println(counter.getCounter());
				
		
		
	}
}
