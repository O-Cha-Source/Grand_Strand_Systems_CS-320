//Benjamin Gagnon
//Test class for contactService
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//tests the creation of a contact in the contact service
	@Test
	void testContactService() {
		ContactService service = new ContactService();
		String ID = service.createContact( "tFname" , "tLname", "1234567890", "37 main street");
		Contact contact = service.getContact(ID);
		assertTrue(contact.getFName().equals("tFname"));
		assertTrue(contact.getLName().equals("tLname"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("37 main street"));
	}
	
	//tests the removal of a contact using the contact service
	@Test
	void testContactServiceRemove() {
		ContactService service = new ContactService();
		String ID = service.createContact( "tFname" , "tLname", "1234567890", "37 main street");
		service.removeContact(ID);
		Contact contact= service.getContact(ID);
		assertTrue(contact.getFName().equals(null));
		assertTrue(contact.getLName().equals(null));
		assertTrue(contact.getPhone().equals(null));
		assertTrue(contact.getAddress().equals(null));
	}
	
	//tests the editing of a contact in the contact service
	@Test
	void testContactServiceEdit() {
		ContactService service = new ContactService();
		String ID = service.createContact( "tFname" , "tLname", "1234567890", "37 main street");
		service.editContactAddress(ID, "address_Test");
		service.editContactFName(ID, "first_Test");
		service.editContactLName(ID, "last_Test");
		service.editContactPhone(ID, "phone_Test");
		Contact contact = service.getContact(ID);
		assertTrue(contact.getFName().equals("address_Test"));
		assertTrue(contact.getLName().equals("first_Test"));
		assertTrue(contact.getPhone().equals("last_Test"));
		assertTrue(contact.getAddress().equals("phone_Test"));
	}
}
