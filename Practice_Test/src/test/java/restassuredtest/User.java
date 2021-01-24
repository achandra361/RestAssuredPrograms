package restassuredtest;

import java.util.ArrayList;

public class User {
	
	private String email;
	private String firstName;
	private String lastName;
	private ArrayList<Integer> mobileNumber;
	
	public ArrayList<Integer> getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(ArrayList<Integer> mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public User(String email,String firstName,String lastName) {
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNumber= new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> setMobileNumber(int...MobileNumber){
		for(int i=0;i<MobileNumber.length;i++) {
			this.mobileNumber.add(MobileNumber[i]);
		}
		
		return mobileNumber;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
