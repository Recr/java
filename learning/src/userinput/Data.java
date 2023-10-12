package userinput;
import java.time.Year;

public class Data {
	private String firstName;
	private String lastName;
	private String fullName;
	private int age;
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public void setAge(int birthYear) {
		int year = Year.now().getValue();
		this.age = year - birthYear;
	}
	
	public String getFullName() {
		this.fullName = this.firstName + " " + this.lastName;
		return this.fullName;
	}
	
	public int getAge() {
		return this.age;
	}
	
}	
