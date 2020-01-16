package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {

		// Read a CSV file and Create New account based on Data

		Checking chkacc1 = new Checking("Tom Moody","123221232",1500);
		Savings savacc1 = new Savings("Roy Peter","345678987",2000);
		chkacc1.showInfo();
		System.out.println("****************");
		savacc1 .showInfo();
		/*savacc1.deposit(10000);
		savacc1.withdraw(3000);
		savacc1.transfer("Brokerage",2000);
		savacc1.compound();
		*/
	}	
}
