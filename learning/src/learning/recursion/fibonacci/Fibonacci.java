package learning.recursion.fibonacci;

public class Fibonacci {
	
	public static int notRecursiveFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * notRecursiveFactorial(n-1);
	}
	
	
	
	
	static int a = 0;
	static int b = 1;
	static int tmp = 0;
	
	public static int fibonacci(int n) {
		
		
		if(n == 1) {
			System.out.println(a);
			return 1;
		}
		else {
			System.out.println(a);
			tmp = b;
			b = a+b;
			a = tmp;
			
			return fibonacci(n-1);
			
		}
	}
}
