package objectserialization;

import java.io.Serializable;

public class User implements Serializable{
	private String username;
	private String address;
	private String email;
	public User(String username, String address, String email) {
		this.username = username;
		this.address = address;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "[ "+username+" "+address+" "+email+" ]";
	}
	
	
}
