package learning.recursion.factorial;

public class Factorial {
	
	public static int notRecursiveFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * notRecursiveFactorial(n-1);
	}
	
	
	
	
		
}
