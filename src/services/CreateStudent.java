package services;

import java.util.List;
import java.util.Scanner;

import model.Student;

public class CreateStudent {

	Scanner scan = new Scanner(System.in);

	public List<Student> createNewStudents(List<Student> students) {
		// TODO Auto-generated method stub
		// taking user id as input
		int id = new Input().getStudentID();

		String name = new Input().getStudentName();

		byte age = new Input().getStudentAge();

		String standard = new Input().getStandard();

		String address = new Input().getAddress();

		Student student = new Student(id, name, age, standard, address);
		students.add(student);
		System.out.println("Student details added successfully");
		return students;
	}

}
