import java.util.Scanner;
import com.lionbank.Account;


public class BankingApp {

	public static void main(String[] args) {

		Account acct123 = new Account(123,100);
		System.out.println(acct123);
		
		while (true) {
		// display menu
		System.out.println("Menu: ");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Exit");
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Menu Selection: ");
		int choice = scanner.nextInt();

		
		// loop
		if (choice == 1) {
			System.out.print("Enter Deposit Amount: ");
			double amount = scanner.nextDouble();
			acct123.deposit(amount);
			System.out.println("New Balance: " + acct123.getBalance());
		}
		else if (choice == 2) {
			System.out.print("Enter Withdrawl Amount: ");
			double amount = scanner.nextDouble();
			acct123.withdraw(amount);
			System.out.println("New Balance: " + acct123.getBalance());
		}
		
		if (choice == 3) {
			System.out.println("Goodbye!");
			break;
		}
		}
	}

}
