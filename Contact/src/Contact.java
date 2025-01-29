import java.util.Scanner;

/** Noah Catchings
 * CIS-315
 * 01/27/2025
 * This program will prompt the user to enter their information and will ensure 
 * the information is entered correctly.
 */

public class Contact {
	public static void main(String[] args) {
		
		String lastname;
		String firstname;
		char midinit;
		String phone;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Create a new contact.");
		System.out.println("Enter the last name: ");
		lastname = scnr.next();
		
		System.out.println("Enter the First Name: ");
		firstname = scnr.next();
		
		System.out.println("Middle Initial: ");
		String midInput = scnr.next();
		midinit = midInput.charAt(0);
		String midinitcheck = midInput.toUpperCase();
		if (midinitcheck != midInput) {
			System.out.println("ERROR: MUST BE CAPITAL");
		}
		
		
		System.out.println("Phone (555) 555-1212: ");
		phone = scnr.next();
		while (phone.length() < 12 || phone.charAt(0) != '(' || phone.charAt(4) != ')' || 
				phone.charAt(8) != '-') {
			
			System.out.println("ERROR: INVALID FORMAT | PLEASE TRY AGAIN");
			phone = scnr.next();
		}
		
	

		System.out.println("ID:\t 556");
		System.out.println("Name:\t" + firstname + " " + midinit + " " + lastname);
		System.out.println("Phone: " + phone);
		
		scnr.close();
	}
}
