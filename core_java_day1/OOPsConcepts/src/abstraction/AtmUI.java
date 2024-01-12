package abstraction;

import java.util.Scanner;

public class AtmUI {

	public static void main(String[] args) {
		
	IBank bank =	new BankImp2();

		System.out.println("***WELCOME TO ATM****");

		Scanner scanner = new Scanner(System.in); // HAS A relationship

		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Enter 1. Deposit");
			System.out.println("Enter 2. Withdraw");
			System.out.println("Enter 3. Exit");
			
			int choice = scanner.nextInt();

			
		switch (choice) {
		case 1:

				// deposit
			
			bank.deposit();
			
			break;
		case 2:
			    // 
			bank.withdraw();

			break;
		case 3:

					flag = false;
					System.out.println("Thank You Visit Again..");
			break;

		default:
			break;
		}

		
		}
	}

}
