package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Student;

public class SearchStudent {

	public List<Student> searchStudentDetails(List<Student> students) {
		// TODO Auto-generated method stub

		List<Student> searchedStudent = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.println("search student by ID or Name");
		System.out.println("1: Id");
		System.out.println("2: Name");
		System.out.println("Enter choice");
		byte choice = scan.nextByte();
		switch (choice) {
		case 1:

			int id = new Input().getStudentID();
			
			System.out.println("---------Searched student detail--------");
			for (int i = 0; i < students.size(); i++) {
				if (id == students.get(i).getId()) {
					searchedStudent.add(students.get(i));
				}
			}
			break;

		case 2:
			
			String name = new Input().getStudentName();
			
			System.out.println("---------Searched student detail--------");
			for (int i = 0; i < students.size(); i++) {
				if (name.equals(students.get(i).getName())) {
					searchedStudent.add(students.get(i));
				}
			}
			break;

		default:
			System.out.println("---invalid choice--");
			break;
		}
		return searchedStudent;
	}

}
