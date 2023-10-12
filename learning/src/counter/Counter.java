package counter;

public class Counter {
	private int counter = 0;
	
	public void counterIncrement(){
		this.counter++;
	}
	
	public void counterReset() {
		this.counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
}

