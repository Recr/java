package learning.matrices.stairs;

public class Main {
	public static void main(String[] args) {
		
		int[][] array = new int[8][];
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				counter++;
			}
			else {
				for(int u = 0; u < i; u++) {
					array[i] = new int[i];
					array[i][u] = counter;
					counter++;
					System.out.print("|" + array[i][u] + "|");
				}
			System.out.println("");
			}
		}
	}
}
