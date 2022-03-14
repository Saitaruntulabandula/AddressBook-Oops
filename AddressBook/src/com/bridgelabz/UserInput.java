package com.bridgelabz;

import java.util.Scanner;


import java.util.ArrayList;

public class UserInput {
	Scanner sc = new Scanner(System.in);
	ArrayList<Info> infolist = new ArrayList<>();

	public void addNewContact()
	{
		Info info = new Info();
		System.out.println("Enter First name:");
		info.setFirstName(sc.next());

		System.out.println("Enter Last Name:");
		info.setLastName(sc.next());

		System.out.println("Enter Address:");
		info.setAddress(sc.next());

		System.out.println("Enter City:");
		info.setCity(sc.next());

		System.out.println("Enter State:");
		info.setState(sc.next());

		System.out.println("Enter Zip:");
		info.setZipCode(sc.nextInt());

		System.out.println("Enter Phone:");
		info.setMobileNumber(sc.next());

		System.out.println("Enter Email:");
		info.setEmailId(sc.next());

		infolist.add(info);
		System.out.println("Contact Added Successfully");
	}
	public void editContact()
	{if( infolist.size()>0) {
		String newFirstName;
		System.out.println("Enter First name of contact to edit it ");
		newFirstName = sc.next();
		for (int i = 0; i < infolist.size(); i++) 
		{
			if (infolist.get(i).getFirstName().equals(newFirstName))
			{
				System.out.println("Enter the field to edit:\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
				int input = sc.nextInt();
				switch (input)
				{
				case 1:
					System.out.println("Enter new first name");
					infolist.get(i).setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					infolist.get(i).setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					infolist.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter new city");
					infolist.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter new state");
					infolist.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter new zip");
					infolist.get(i).setZipCode(sc.nextInt());
					break;
				case 7:
					System.out.println("Enter new phone number");
					infolist.get(i).setMobileNumber(sc.next());
					break;
				case 8:
					System.out.println("Enter new email");
					infolist.get(i).setEmailId(sc.next());
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
		if( infolist.size()>0) {
			System.out.println("Enter the firstName of the contact which you want to delete ");
			String delName = sc.next();
			for ( int i =0; i< infolist.size(); i++) {
				if(infolist.get(i).getFirstName().equals(delName))
				{
					Info contact = infolist.get(i);
					infolist.remove(contact);
					System.out.println("Contact deleted Successfully...");
				}
				else
					System.out.println("No such contact exist here....");
			}
		}else System.out.println("There are no contacts as of now ......");

	}
	public void displayList() {
		{	if( infolist.size()>0) {
			for (Info iterator : infolist)
			{
				System.out.println(iterator);
			}
		}else System.out.println("There are no contacts here as of now .....");
	 }
   }
}

public class UserInput {
	Info info;	
	public void addContacts() {
		System.out.println("Enter following details.....");
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Last Name : ");
		String lastName = sc.nextLine();
		System.out.println("Address : ");
		String address = sc.nextLine();
		System.out.println("City : ");
		String city = sc.nextLine();
		System.out.println("State : ");
		String state = sc.nextLine();
		System.out.println("Zip Code : ");
		int zipCode = sc.nextInt();
		System.out.println("Mobile Number : ");
		String mobileNumber = sc.next();
		System.out.println("Email Id: ");
		String email = sc.next();
		info = new Info(firstName, lastName, address, state, city, zipCode, mobileNumber, email);
		System.out.println("You have added a contact :) ");
		sc.close();
	}
	@Override
	public String toString() {
		return info.toString() ;
	}
}

