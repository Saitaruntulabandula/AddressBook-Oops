package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);
	ArrayList<Contacts> contactlist = new ArrayList<>();
	private HashMap<String, ArrayList<Contacts>> addressBook = new HashMap<>();
	public void addNewContact()
	{
		Contacts contact = new Contacts();
		System.out.println("Enter First name:");
		contact.setFirstName(sc.next());

		System.out.println("Enter Last Name:");
		contact.setLastName(sc.next());

		System.out.println("Enter Address:");
		contact.setAddress(sc.next());

		System.out.println("Enter City:");
		contact.setCity(sc.next());

		System.out.println("Enter State:");
		contact.setState(sc.next());

		System.out.println("Enter Zip:");
		contact.setZipCode(sc.nextInt());

		System.out.println("Enter Phone:");
		contact.setMobileNumber(sc.next());

		System.out.println("Enter Email:");
		contact.setEmailId(sc.next());

		contactlist.add(contact);
		System.out.println("Contact Added Successfully");

		System.out.println("Enter a book name to which you want to add the contact..");
		String bookName = sc.next();
		if(addressBook.containsKey(bookName)) {
			ArrayList<Contacts> contactList = addressBook.get(bookName);
			addressBook.put(bookName, contactList);
			System.out.println("New Contact added to the " +bookName);
		} else {
			ArrayList<Contacts> contactList = addressBook.get(bookName);
			addressBook.put(bookName, contactList);
			System.out.println(bookName+ " created ");
			System.out.println("New Contact added to the " +bookName);
		}	
	}

	public void editContact()
	{	if( contactlist.size()>0) {
		String newFirstName;
		System.out.println("Enter First name of contact to edit it ");
		newFirstName = sc.next();
		for (int i = 0; i < contactlist.size(); i++) 
		{
			if (contactlist.get(i).getFirstName().equals(newFirstName))
			{
				System.out.println("Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
				int input = sc.nextInt();
				switch (input)
				{
				case 1:
					System.out.println("Enter new first name");
					contactlist.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					contactlist.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					contactlist.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter new city");
					contactlist.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter new state");
					contactlist.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter new zip");
					contactlist.get(i).setZipCode(sc.nextInt());
					break;
				case 7:
					System.out.println("Enter new phone number");
					contactlist.get(i).setMobileNumber(sc.next());
					break;
				case 8:
					System.out.println("Enter new email");
					contactlist.get(i).setEmailId(sc.next());
					break;
				default:
					System.out.println("Invalid Entry");
				}     
				System.out.println("Contact Edited Successfully");
			} else 
				System.out.println("Contact doesn't exist");
		}
	}else System.out.println("There are no contacts as of now.....");
	}

	public void deleteContact() {
		if( contactlist.size()>0) {
			System.out.println("Enter the firstName of the contact which you want to delete ");
			String delName = sc.next();
			for ( int i =0; i< contactlist.size(); i++) {
				if(contactlist.get(i).getFirstName().equals(delName))
				{
					Contacts contact = contactlist.get(i);
					contactlist.remove(contact);
					System.out.println("Contact deleted Successfully...");
					break;
				}
				else
					System.out.println("Contact not found.... ");
			}
		}else System.out.println("There are no contacts as of now ......");

	}
	public void displayList() {
		{	if( contactlist.size()>0) {
			for (Contacts iterator : contactlist)
			{
				System.out.println(iterator);
			}
		}else System.out.println("There are no contacts here as of now .....");
		}
	}
}
