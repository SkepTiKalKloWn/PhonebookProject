public class Entry{
	private String key
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	
	public static Entry(String fname, String lName, String eAddress, String pNumber){
		firstName = fName;
		lastName = lName;
		keyName = String.toUpper(fName+lName);
		emailAddress = eAddress;
		phoneNumber = phoneNumber;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public String getKey(){
		return key;
	}
}
