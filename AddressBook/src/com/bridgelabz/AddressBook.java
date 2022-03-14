package com.bridgelabz;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
		UserInput userInput = new UserInput();
		userInput.addContacts();
		System.out.println(userInput.toString());
	}
}
