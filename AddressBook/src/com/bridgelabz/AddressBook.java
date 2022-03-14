package com.bridgelabz;
import java.util.Scanner;
public class AddressBook {
	static UserInput obj = new UserInput();

	public static void main(String[] args) {

		boolean isExit = false;
		while (!isExit)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Select any option from below \n 1.Add Contact.\n 2.Edit Contact.\n 3.Delete Contact \n 4.Display Contact \n 5.Exit");
			int input = sc.nextInt();
			switch (input)
			{
			case 1:
				System.out.println("Add contact details ");
				obj.addNewContact();
				break;
			case 2:
				obj.editContact();
				break;
			case 3:
				obj.deleteContact();
				break;
			case 4:
				obj.displayList();
				break;
			case 5:
				isExit = true;
				break;
			default:
				System.out.println("Kindly enter a valid input");
				sc.close();
			}
		}

		System.out.println("Welcome to Address Book System");
		UserInput userInput = new UserInput();
		userInput.addContacts();
		System.out.println(userInput.toString());

	}
}
