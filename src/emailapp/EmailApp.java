package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John","Smith");
		em1.setAlternetEmail("Test.Testing@Dev.AnyCompany.com");
		System.out.println("Your Alternet Email is :" + em1.getAlternetEmail());
			
		System.out.println(em1.showInfo());
	}
	
	

}
