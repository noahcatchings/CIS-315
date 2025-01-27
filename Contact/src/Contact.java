import java.util.Scanner;

/** Noah Catchings
 * CIS-315
 * 01/27/2025
 * This program will...
 */

public class Info {
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
		midinit = midInput.toUpperCase().charAt(0);
		
		System.out.println("Phone (555) 555-1212: ");
		phone = scnr.next();

		System.out.println("ID:\t 556");
		System.out.println("Name: \t" + firstname + " " + midinit + " " + lastname);
		
	}
}
