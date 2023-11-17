package actionItempackage;

public class BankAcount {

	private int accountNumber;
	private int accountBalance;
	private String customerName;
	private String email;
	private long phoneNumber;

	public BankAcount(int accountNumber, int accountBalance, String customerName, String email, long phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int depositFund(int add) {
		return add + accountBalance;
	}

	public int withdrawFunds(int withdraw) {

		if (accountBalance < withdraw) {

			System.out.print("Sorry...!!! you dont have any balance in your account. Balance = ");
			return 0;
		}
		return accountBalance - withdraw;

	}
}
