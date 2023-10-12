package userinput;
import java.util.Scanner;

/*
 * Gets the user name, last name and birth year.
 * Returns the user full name and age.
 */

public class Input {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String tempName;
		int tempYear;
		
		Data userA = new Data();
		
		System.out.print("Type you first name: ");
		tempName = scanner.nextLine();
		userA.setFirstName(tempName);
		
		System.out.print("Type you last name: ");
		tempName = scanner.nextLine();
		userA.setLastName(tempName);
		
		System.out.print("Type you year of birth: ");
		tempYear = scanner.nextInt();
		userA.setAge(tempYear);
		
		tempName = userA.getFullName();
		tempYear = userA.getAge();
		
		System.out.println("Name: " + tempName);
		System.out.println("Age: " + tempYear);
	}

}
