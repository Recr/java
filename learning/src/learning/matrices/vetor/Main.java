package learning.matrices.vetor;

public class Main {
	public static void main(String[] args) {
		int[] vetor = new int[] { 9, 10, 8, 12, 6, 2, 1, 8 };
		int[][] array = new int[8][];
		int counter = 1;

		for (int i = 0; i < array.length; i++) {
			array[i] = new int[(vetor[i])];
			for (int u = 0; u < (vetor[i]); u++) {
				array[i][u] = counter;
				counter++;
				System.out.print("|" + array[i][u] + "|");
			}
			System.out.println("");
		}
	}
}
