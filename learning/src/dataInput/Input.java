package dataInput;
import java.util.Scanner;


public class Input {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String tempName;
		int tempYear, i=0;
		Register[] users = new Register[3];
		
		
		for(i = 0; i < users.length; i++) {
			Register tempUser = new Register();
			tempName = scanner.nextLine();
			System.out.print("Type user " + (i+1) + " first name: ");
			tempName = scanner.nextLine();
			tempUser.setFirstName(tempName);
		
			System.out.print("Type user " + (i+1) + " last name: ");
			tempName = scanner.nextLine();
			tempUser.setLastName(tempName);
		
			System.out.print("Type user " + (i+1) + " year of birth: ");
			tempYear = scanner.nextInt();
			tempUser.setAge(tempYear);
		
			users[i] = tempUser;
		}
	
		for(i = 0; i < users.length; i++) {
			tempName = users[i].getFullName();
			tempYear = users[i].getAge();
		
			System.out.println("|User " + (i+1) + "|");
			System.out.println("Name: " + tempName);
			System.out.println("Age: " + tempYear);
			System.out.println("");
		
		}
		
		
	}
}
