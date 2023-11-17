package actionItempackage;

public class Main {

	public static void main(String[] args) {
		/*
		 * 10. Create a new project called ActionItem Create a class named Main Create
		 * another class for a bank account Create fields for account characteristics
		 * like: Account Number Account balance Customer name Email Phone number You
		 * want to make this class encapsulated, so you will make all your attributes
		 * private, and set up getter and setter methods for your attributes. In
		 * addition, you will have two additional behavioral methods, for depositing
		 * funds and withdrawing funds: Depositing funds into the account Withdrawing
		 * funds from the account A Customer should not be allowed to withdraw funds, if
		 * that withdrawal takes their balance negative. Create an instance of an
		 * Account class in the Main class, and then test your withdraw and deposit
		 * methods Print information to the console, which confirms what the balance is
		 * after the methods are called. If you can – push your code to GitHub and
		 * submit your project url. >>>>> If you cannot push your code to GitHub –
		 * submit the console output with the contents of BankAccont and Main Class
		 */

		BankAcount account = new BankAcount(9223, 30000, "Branden Tyler", "bradentyler@gmail.com", 909344422);

		System.out.println(account.depositFund(2000));

		int balance = account.withdrawFunds(70000);
		System.out.println(balance);

	}

}
