package stringbuilder;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		final int SIZE = 5;
		
		User[] users = new User[] {
				new User("São Paulo", "São Paulo"),
				new User("Canindé", "São Paulo"),
				new User("Belo Horizonte", "Minas Gerais"),
				new User("Los Angeles", "California")
		};
		
		for(int usersRow = 0; usersRow < users.length; usersRow++) {
			System.out.println(users[usersRow].getLocation());
		}
	}
}
