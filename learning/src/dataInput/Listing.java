package dataInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listing {
	public static void main(String[] args) {
		
		List<Data> users = new ArrayList<>();
		
		Scanner scn = new Scanner(System.in);
		
		int i = 0;
		
		while(i < 2) {
			Data temp = new Data();
			String tempName;
			int birthYear;
			System.out.print("User " + (i+1) + " first name: ");
			tempName = scn.nextLine();
			temp.setFirstName(tempName);
			System.out.print("User " + (i+1) + " last name: ");
			tempName = scn.nextLine();
			temp.setLastName(tempName);
			System.out.print("User " + (i+1) + " birth year: ");
			birthYear = scn.nextInt();
			temp.setAge(birthYear);
			users.add(temp);
			i++;
		}
		
		i = 0;
		
		while(i < 2) {
			String name;
			int age;
			name = users.get(i).getFullName();
			age = users.get(i).getAge();
			System.out.println(name);
			System.out.println(age);
			i++;
		}
	}
}
