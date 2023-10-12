package random;
import java.util.Random;

public class IntRandom {
	public static void main(String[] args){
	
	Random rngInt = new Random();
	int i = 0;
	
	for(i = 0; i < 10; i++){
		int number = rngInt.nextInt(100);
		System.out.println(number);
	}
}
}