package bankaccountapp;
//Saving account is an Child Class and Account is Parrant Class 

//Saving Class is Inheriting the Properties and Method of object class
//there is as has --a relationship between Saving and Account Class

public class Savings extends Account {
	// list the Properties specific to Saving account
	private int saftyDepositBoxID;
	private int saftyDepositBoxkey;

	// Constructor to initialize the setting for savings account
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		/*
		 * System.out.print("\nAccount Number:" + this.accountNumber);
		 * System.out.println("\nNew Saving Account");
		 */
	}

	@Override
	public void setRate() {
		rate = getBaseRate() -.25;

	}

	private void setSafetyDepositBox() {
		saftyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		saftyDepositBoxkey = (int) (Math.random() * Math.pow(10, 4));

	}

	// list any method specific to Checking account
	public void showInfo() {
		System.out.println("Account Type:Saving");
		super.showInfo();
		System.out.println(" Your Saving account Features:" + " \n saftyDepositBoxID = " + saftyDepositBoxID
				+ " \n saftyDepositBoxkey = " + saftyDepositBoxkey);
	}
}
