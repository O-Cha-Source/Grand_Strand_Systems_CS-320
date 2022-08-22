//Benjamin Gagnon
//This is the class that handles the contacts

import java.lang.*;
import java.util.*;

public class ContactService {
	private List<Contact> contacts = new ArrayList<Contact>();
	private double IDcounter = 0;
	
	//Creates contact without passed info
	public String createContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a first name");
		String fName = sc.nextLine();
		System.out.println("Please enter a last name");
		String lName = sc.nextLine();
		System.out.println("Please enter a Phone Number");
		String phone = sc.nextLine();
		System.out.println("Please enter an address");
		String address = sc.nextLine();
		return createContact(fName, lName, phone, address);
	}
	
	//Creates contact with passed info
	public String createContact(String firstName, String lastName, String phone, String address)  {
		IDcounter++;
		String ID = String.format("%010f", IDcounter);
		contacts.add(new Contact(ID, firstName, lastName, phone, address));
		return ID;
	}
	
	//Removes contact based off of ID
	public void removeContact(String ID) {
		Iterator itr = contacts.iterator();
		while(itr.hasNext()) {
			Contact temp = (Contact) itr.next();
			if(temp.getID() == ID) {
				itr.remove();
			}
			
		}
	}
	
	//edits first name of contact based off of ID
	public void editContactFName(String ID, String name) {
		Iterator itr = contacts.iterator();
		while(itr.hasNext()) {
			Contact temp = (Contact) itr.next();
			if(temp.getID() == ID) {
				temp.setFName(name);
			}
			
		}
	}
	
	//edits last name of contact based off of ID
	public void editContactLName(String ID, String name) {
		Iterator itr = contacts.iterator();
		while(itr.hasNext()) {
			Contact temp = (Contact) itr.next();
			if(temp.getID() == ID) {
				temp.setLName(name);
			}
			
		}
	}
	
	//edits phone number of contact based off of ID
	public void editContactPhone(String ID, String number) {
		Iterator itr = contacts.iterator();
		while(itr.hasNext()) {
			Contact temp = (Contact) itr.next();
			if(temp.getID() == ID) {
				temp.setPhone(number);
			}
			
		}
	}
	
	//edits address of contact based off of ID
	public void editContactAddress(String ID, String address) {
		Iterator itr = contacts.iterator();
		while(itr.hasNext()) {
			Contact temp = (Contact) itr.next();
			if(temp.getID() == ID) {
				temp.setAddress(address);
			}
			
		}
	}
	
	//Returns contact based off of ID
	public Contact getContact(String ID){
		Iterator itr = contacts.iterator();
		while(itr.hasNext()) {
			Contact temp = (Contact) itr.next();
			if(temp.getID() == ID) {
				return temp;
			}
		}
		return new Contact(null, null, null, null, null);
	}
	
}
