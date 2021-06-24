package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Student;

public class SortStudent {

	public List<Student> sortStudentDetails(List<Student> students) {

		Collections.sort(students);

		//sorting students name by Comparator
//		Comparator<Student> comparator = new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
//		Collections.sort(students, comparator);

		return students;
	}
}
