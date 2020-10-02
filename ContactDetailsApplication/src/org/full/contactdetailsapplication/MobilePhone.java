package org.full.contactdetailsapplication;

import java.util.Scanner;
import java.util.TreeMap;

public class MobilePhone {

	public static Scanner contactDetails = new Scanner(System.in);
	static TreeMap<String, String> contactList = new TreeMap<String, String>();

	public static void main(String[] args) {

		var add = new AddContacts();
		var delete = new DeleteContacts();
		var print = new PrintContact();
		var printAll = new PrintContacts();

		System.out.println("\t\tContact Details Application");
		System.out.println();
		boolean quit = true;
		Actions.printAction();
		while (quit) {

			System.out.println("Enter the action:");
			int action = contactDetails.nextInt();
			contactDetails.nextLine();

			switch (action) {

			case 0:
				System.out.println("\t\tApplication Closed");
				quit = false;
				break;

			case 1:
				add.addNewContacts();
				break;

			case 2:
				delete.deleteExistingContacts();
				break;

			case 3:
				print.printParticularContact();
				break;

			case 4:
				printAll.printAllContacts();
				break;

			}

		}
	}

}
