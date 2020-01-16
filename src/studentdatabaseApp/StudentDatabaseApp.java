package studentdatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
						
		//Creating and array of Object(Ask how many new users we want to add )
		System.out.println("Enter the number of new Students to Enroll:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int numofStudent = in.nextInt();
		Student[] students = new Student[numofStudent];
		
		//create n number of new student
		
		for (int n = 0; n < numofStudent; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].toString());
		}
		//System.out.println(students[0].toString());
		//System.out.println(students[1].toString());
		
	}

}
