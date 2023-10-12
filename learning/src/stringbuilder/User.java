package stringbuilder;
import java.lang.StringBuilder;
public class User {
	private String city;
	private String state;
	
	public User(String city, String state) {
		this.city = city;
		this.state = state;
	}
	
	public String getLocation(){
		StringBuilder location = new StringBuilder();
		location.append(city);
		location.append(" - ");
		location.append(state);
		return location.toString();
	}
	

}
