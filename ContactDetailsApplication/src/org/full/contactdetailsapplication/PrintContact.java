package org.full.contactdetailsapplication;

public class PrintContact implements PrintParticularContactDetails {

	public void printParticularContact() {

		System.out.println("Enter the Existing Contact: ");
		String name = MobilePhone.contactDetails.nextLine();
		if (MobilePhone.contactList.containsKey(name)) {
			String mobileNumber = MobilePhone.contactList.get(name);
			System.out.println("Name= " + name + " MobileNumber= " + mobileNumber);
		} else {
			System.out.println("Name not found");
		}

	}

}
