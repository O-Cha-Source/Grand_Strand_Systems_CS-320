//Benjamin Gagnon
//This is the test class for the contact class
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//Tests the creation of a new contact
	@Test
	void testContact() {
		Contact contact = new Contact("123", "tFname" , "tLname", "1234567890", "37 main street");
		assertTrue(contact.getID().equals("123"));
		assertTrue(contact.getFName().equals("tFname"));
		assertTrue(contact.getLName().equals("tLname"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("37 main street"));
	}
	
	//Tests the editing of a contact first name
	@Test
	void testSetFName() {
		Contact contact = new Contact("123", "test_Fname" , "test_Lname", "1234567890", "37 main street");
		contact.setFName("tested");
		assertTrue(contact.getFName().equals("tested"));
		contact.setFName("wibblewobble");
		assertTrue(contact.getFName().equals("tested"));
		contact.setFName(null);
		assertTrue(contact.getFName().equals("tested"));
	}

	//Tests the editing of a contacts last name
	@Test
	void testSetLname() {
		Contact contact = new Contact("123", "test_Fname" , "test_Lname", "1234567890", "37 main street");
		contact.setLName("tested");
		assertTrue(contact.getLName().equals("tested"));
		contact.setLName("wibblewobble");
		assertTrue(contact.getLName().equals("tested"));
		contact.setLName(null);
		assertTrue(contact.getLName().equals("tested"));
	}
	
	//tests the editing of a contact's phone number 
	@Test
	void testSetPhone() {
		Contact contact = new Contact("123", "test_Fname" , "test_Lname", "1234567890", "37 main street");
		contact.setPhone("0987654321");
		assertTrue(contact.getPhone().equals("0987654321"));
		contact.setPhone("10000000000");
		assertTrue(contact.getPhone().equals("0987654321"));
		contact.setPhone(null);
		assertTrue(contact.getPhone().equals("0987654321"));
	}
	
	//Tests the editing of a contacts address
	@Test
	void testSetAddress() {
		Contact contact = new Contact("123", "test_Fname" , "test_Lname", "1234567890", "37 main street");
		contact.setAddress("tester street");
		assertTrue(contact.getPhone().equals("tester street"));
		contact.setPhone("10000000000000000000");
		assertTrue(contact.getPhone().equals("tester street"));
	}
}
