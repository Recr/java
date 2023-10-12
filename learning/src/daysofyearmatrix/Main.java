package daysofyearmatrix;

/*
 * creates an array with 365 elements, with an row for each month containing 
 * the exact amount of days (elements).
 */

public class Main {
	public static void main(String[] args) {
		int[][] months = new int[12][];
		int[] monthsDays = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 1;
		
		for(int column = 0; column < months.length; column++) {
			months[column] = new int[monthsDays[column]];
			for(int row = 0; row < monthsDays[column]; row++) {
				months[column][row] = day;
				day++;
				System.out.print("|" + months[column][row] + "|");
			}
			System.out.println();
		}
		
	}
}
