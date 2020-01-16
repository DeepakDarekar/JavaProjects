package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength = 10;
	private int emailboxCapacity;
	private String alternateMail;
	private String companySuffix = "anything.com";
	private int mailboxCapacity;
	private String alternatEmail;
	private String setChangePassword;
	private String changePassword;

	// Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created Successfully: " + this.firstName + " " + this.lastName);

		// Call a method asking for department -return the department
		this.department = setDepartment();
		//System.out.println("Department:" + this.department);

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// Combine elements to Genrate the email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is : " + this.email);
	}

	// Ask for the Department
	private String setDepartment() {
		System.out.println(
				"DEPARTMENT CODES\n1 for Sales\n2 for Devlopment\n3 for Accounting\n0 for None\nEnter the Departmant Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();

		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "accounting";
		} else {
			return "";
		}
	}

	// Genrate the random password

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567891@$#!";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);

	}

	// Set the Mail Box Capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// Srt the Alternet email
	public void setAlternetEmail(String altEmail) {
		this.alternatEmail = altEmail;
	}

	// Set the Change password
	public void setChangePassword(String changePass) {
		this.changePassword = changePass;
	}

	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternetEmail() {
		return alternatEmail;
	}

	public String getChangePassword() {

		return changePassword;
	}
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
			    "\nCompany Email: " + email + 
			    "\nMailbox Capacity: "+ mailboxCapacity + "mb";
	}
}

// Set the MailBox Capacity

// Set the Alternate Email

// Set the Change the password
