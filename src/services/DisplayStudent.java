package services;

import java.util.List;

import model.Student;

public class DisplayStudent {

	public void studentDetails(List<Student> students) {
		// TODO Auto-generated method stub
		for (Student student : students) {
			System.out.println("----------------------------------");
			System.out.println("Student ID	:" + student.getId());
			System.out.println("Student Name	:" + student.getName());
			System.out.println("Student Age	:" + student.getAge());
			System.out.println("Student Standard:" + student.getStandard());
			System.out.println("Student Address	:" + student.getAddress());
		}
	}
}
