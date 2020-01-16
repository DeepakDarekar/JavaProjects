package bankaccountapp;

public interface IBaseRate {

	//Write a method that written the base Rate
	default double getBaseRate() {
		return 2.5;
	}
}
