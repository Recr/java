package fibonacci;

public class Main {
	public static void main(String[] args) {
		int n0 = 0,
		    n1 = 1,
		     n = 0;
		
		for(int terms = 0; terms < 30; terms++) {
			System.out.println(n0);
			n = n0 + n1;
			n0 = n1;
			n1 = n;
		}
		
		
		
	}
}
