package org.full.contactdetailsapplication;

public class AddContacts implements AddContactsDetails {

	String name;
	String mobileNumber;

	public void addNewContacts() {

		System.out.print("Enter the Contact Name: ");
		name = MobilePhone.contactDetails.nextLine();

		if (MobilePhone.contactList.containsKey(name)) {
			System.out.println("Name already exist");
			System.out.print("Enter the New Contact Name: ");
			name = MobilePhone.contactDetails.nextLine();
		}

		System.out.print("Enter the Mobile Number: ");
		mobileNumber = MobilePhone.contactDetails.nextLine();

		if (MobilePhone.contactList.containsValue(mobileNumber)) {
			System.out.println("Mobile Number already exist");
			System.out.print("Enter the New Mobile Number: ");
			mobileNumber = MobilePhone.contactDetails.nextLine();
		}
		MobilePhone.contactList.put(name, mobileNumber);

		System.out.println("New Contact Added: name = " + name + "\tmobilenumber = " + mobileNumber);

	}

}
