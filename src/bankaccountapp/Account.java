package bankaccountapp;
//This class is declare as abstract as we are not going to create the Object from Account Class

//Account Class would be the Base class for Saving and Checking Function

public abstract class Account implements IBaseRate {
	// list common properties for saving and Checking account
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	// Constructor to set the properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		// System.out.print("Name:" + name + " SSN:" + sSN + " Balance:$ " + balance);

		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	public void compound() {
		double accruedIntrest = balance * (rate/100);
		balance = balance + accruedIntrest;
		System.out.println("Accrured Intrest :"+accruedIntrest);
		printBalance();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}

	// list common method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit $" + amount);
		printBalance();
	}	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("withdraw $" + amount);
		printBalance();
	}
	public void transfer(String toWhere,double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " +toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now $" + balance);
	}

	public void showInfo() {
		System.out.println(
				"Name: " + name + "\n AccountNumber:" + accountNumber + "\n Balance:" + balance + "\n Rate = " + rate);

	}
}
