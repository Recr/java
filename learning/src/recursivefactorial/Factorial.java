package recursivefactorial;

public class Factorial {
	
	public static int RecursiveFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * RecursiveFactorial(n-1);
	}
	
	
	
	
		
}
