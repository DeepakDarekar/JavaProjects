package bankaccountapp;
//Saving account is an Child Class and Account is Parrant Class 

//Saving Class is Inheriting the Properties and Method of object class
//there is as has --a relationship between Saving and Account Class

public class Checking extends Account {
	// list the Properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;

	// Constructor to initialize the setting for saving account
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		/*
		 * System.out.print("\nAccount Number:" + this.accountNumber);
		 * System.out.println("\nNew Checking Account");
		 */
	}

	@Override
	public void setRate() {
		rate = getBaseRate() *.15;
	}

	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 12));
	}

	// list any method specific to Checking account
	public void showInfo() {
		System.out.println("Account Type:Checking");
		super.showInfo();
		System.out.println(" Youe Checking account features:" + "\n DebitCard Number = " + debitCardNumber
				+ "\n DebitCard Pin = " + debitCardPin);
	}
}
