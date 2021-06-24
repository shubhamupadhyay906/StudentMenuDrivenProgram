package services;

import java.util.List;
import java.util.Scanner;

import model.Student;

public class UpdateStudent {

	public void updateStudentDetails(List<Student> students) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Update Address or Age");
		System.out.println("1: Update address");
		System.out.println("2: Upadte age");
		System.out.println("Enter choice");
		int choice = scan.nextInt();
		int id;
		switch (choice) {
		case 1:
			System.out.println("Enter ID");
			id = scan.nextInt();
			System.out.println("Enter New Address");
			String address = scan.next();
			for (Student student : students) {
				if (student.getId() == id) {
					student.setAddress(address);
				}
			}
			System.out.println("Updated successfully");
			break;
		case 2:
			System.out.println("Enter ID");
			id = scan.nextInt();
			System.out.println("Enter Age");
			byte age = scan.nextByte();
			for (Student student : students) {
				if (student.getId() == id) {
					student.setAge(age);
				}
			}
			System.out.println("Updated successfully");
			break;
		default:
			System.out.println("---invalid choice--");
			break;
		}
	}

}
