package factorial;

public class Factorial {
	public static void main(String[] args) {
		int n = 15;
		if(n == 0) 
			n = 1;
		for(int i = n; i > 1; i--) 
			n *= i-1;
		
		
		System.out.println(n);
	}
}
