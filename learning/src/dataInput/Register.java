package dataInput;

import java.time.Year;

public class Register {

	
	private int age;
	private String firstName;
	private String lastName;
	private String fullName;
	
	
	public void setFirstName(String name){
		this.firstName = name;
	}
	
	public void setLastName(String name){
		this.lastName = name;
	}
	
	public void setAge(int birthYear){
		int year = Year.now().getValue(); //gets the current year as an integer value
		this.age =  year - birthYear;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	public String getFullName(){
		this.fullName = this.firstName + " " + this.lastName;
		return this.fullName;
	}
	
	public int getAge(){
		return this.age;
	}
	
}
