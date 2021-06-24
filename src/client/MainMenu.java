package client;

//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;
import services.*;
//import services.CreateStudent;
//import services.DisplayStudent;
//import services.UpdateStudent;
//import services.DeleteStudent;

public class MainMenu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();

		boolean flag = true;

		do {
			DisplayMenu displayMenu = new DisplayMenu();
			displayMenu.displayMainMenu();
			System.out.println("Enter your choice");
			byte choice = scan.nextByte();
			switch (choice) {
			case 1:
				// create student record
				students = new CreateStudent().createNewStudents(students);
				break;

			case 2:
				// update student details
				new UpdateStudent().updateStudentDetails(students);
				break;

			case 3:
				// delete user details
				new DeleteStudent().deleteStudentDetail(students);
				break;

			case 4:
				// display user details
				new DisplayStudent().studentDetails(students);
				break;

			case 5:
				// search student by id or name
				List<Student> searchedStudent = new SearchStudent().searchStudentDetails(students);
				new DisplayStudent().studentDetails(searchedStudent);
				break;
			case 6:
				// sort student by standard
				searchedStudent = new SortStudent().sortStudentDetails(students);
				new DisplayStudent().studentDetails(searchedStudent);
				break;

			case 7:
				System.out.println(".....Thank you....");
				flag = false;
				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (flag);

	}

}
