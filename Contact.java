//Benjamin Gagnon
// This is the class that handles all contact information
public class Contact {
	private String ID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Constructor for the contact class
	public Contact(String ID, String firstName, String lastName, String phone, String address) {
		try{
			setID(ID);
		}catch (Exception e) {
			System.out.println("ID error");
		}
		
		try{
			setFName(firstName);
		}catch (Exception e) {
			System.out.println("First name error");
		}
		
		try{
			setLName(lastName);
		}catch (Exception e) {
			System.out.println("Last name error");
		}
		
		try{
			setPhone(phone);
		}catch (Exception e) {
			System.out.println("Phone number error");
		}
		
		try{
			setAddress(address);
		}catch (Exception e) {
			System.out.println("address error");
		}
	}
	
	//Private function to set the ID for the contact
	private boolean setID(String ID) {
		
		if(ID != null) {
			if (ID.length() <= 10) {
				this.ID = ID;
				return true;
			}
			else {
				System.out.println("ID cannot be more than 10 characters");
				return false;
			}
		} 
		else{
			System.out.println("ID cannot be null.");
			return false;
		}
		
	}
	
	//Function to set the first name of the contact
	public boolean setFName(String FName) {
		
		if(FName != null) {
			if (FName.length() <= 10) {
				this.firstName = FName;
				return true;
			}
			else {
				System.out.println("name cannot be more than 10 characters");
				return false;
			}
		} 
		else{
			System.out.println("name cannot be null.");
			return false;
		}
		
	}
	
	//Function to set the first name of the contact
	public boolean setLName(String LName) {
		
		if(LName != null) {
			if (LName.length() <= 10) {
				this.lastName = LName;
				return true;
			}
			else {
				System.out.println("name cannot be more than 10 characters");
				return false;
			}
		} 
		else{
			System.out.println("name cannot be null.");
			return false;
		}
		
	}

	//Function to set the phone number of the contact
	public boolean setPhone(String phone) {
		
		if(phone != null) {
			if (phone.length() == 10) {
				this.phone = phone;
				return true;
			}
			else {
				System.out.println("phone number must be 10 numbers");
				return false;
			}
		} 
		else{
			System.out.println("phone number cannot be null.");
			return false;
		}
		
	}
	
	//Function to set the address of the contact
	public boolean setAddress(String address) {
		
		if(address != null) {
			if (address.length() <= 30) {
				this.address = address;
				return true;
			}
			else {
				System.out.println("addressmust be no longer than 30 characters");
				return false;
			}
		} 
		else{
			System.out.println("address cannot be null.");
			return false;
		}
		
	}
	
	//Get methods for the class
	public String getID(){
		return ID;
	}
	public String getFName(){
		return firstName;
	}
	public String getLName(){
		return lastName;
	}
	public String getPhone(){
		return phone;
	}
	public String getAddress(){
		return address;
	}
	
	
}

