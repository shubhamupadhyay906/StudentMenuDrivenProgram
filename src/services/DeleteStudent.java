package services;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import model.Student;

public class DeleteStudent {

	public void deleteStudentDetail(List<Student> students) {
		// TODO Auto-generated method stub
		
		int id = new Input().getStudentID();
		
//		for (int i = 0; i < students.size(); i++) {
//			if (id == students.get(i).getId()) {
//				students.remove(students.get(i));
//			}
//		}
		//deleting a student details using Iterator
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getId()==id) {
				iterator.remove();
			}
		}

		//deleting a student details using ListIterator
//		ListIterator<Student> iterator = students.listIterator();
//		while(iterator.hasNext()) {
//			if(iterator.next().getId()==id) {
//				iterator.remove();
//			}
//		}
		
		System.out.println("Deleted successfully");
	}
}
