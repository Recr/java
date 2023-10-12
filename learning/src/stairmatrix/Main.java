package stairmatrix;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[][] stairArray = new int[8][];
		int counter = 1;
		
		for(int column = 0; column < stairArray.length; column++) {
			if(column != 0) {
				stairArray[column] = new int[column];
				for(int row = 0; row < column; row++) {
					stairArray[column][row] = counter;
					counter++;
				}
			}
			System.out.println(Arrays.toString(stairArray[column]));
		}
		
		
	}
}
