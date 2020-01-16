package studentdatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tutionBalance = 0;
	private static int costOfCource = 600;
	private static int id = 1000;

	// Initialize Constructor:promt user to entyer students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student FirstName:");
		this.firstName = in.nextLine();

		System.out.println("Enter Student LastName:");
		this.lastName = in.nextLine();

		System.out.println("1 -Freshmen\n2 -Sophmore\n3 -Junior\n4 -Senior\nEnter Student Class Level:");
		this.gradeYear = in.nextInt();
		setSudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	// Genrate an ID
	private void setSudentID() {
		// Grade Level +id \
		id++;
		this.studentID = gradeYear + "" + id;

	}

	// Implement Enrollment Method a Cources
	public void enroll() {
		// Get Inside a loop,user hits 0
		do {
			System.out.print("Enter Course to enrol(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance = tutionBalance + costOfCource;
			} else {
				break;
			}

		} while (1 != 0);

		System.out.println("Enrolled In: " + courses);
		System.out.println("Tution Balance:" + tutionBalance);
	}

	// View Balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tutionBalance);
	}

	// Implementing the Pay Tution Method
	public void payTution() {
		viewBalance();
		System.out.println("Enter your Payment :");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();

		tutionBalance = tutionBalance - payment;
		System.out.println("Thank yoo for your payment of $" + payment);

	}
	// Show status

	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level:"+ gradeYear +
				"\nStudent ID:"+ studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tutionBalance;
	}
}
