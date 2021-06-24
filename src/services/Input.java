package services;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	static Scanner scan;
	static int id;
	static String name;
	static byte age;

	public int getStudentID() {
		// TODO Auto-generated method stub

		try {
			scan = new Scanner(System.in);
			System.out.println("Enter ID");
			id = scan.nextInt();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Invalid Id....");
			getStudentID();
		}
		return id;
	}

	public String getStudentName() {

		scan = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = scan.next();

		return name;
	}

//	public byte getStudentAge() {
//		// TODO Auto-generated method stub
//
//		try {
//			scan = new Scanner(System.in);
//			System.out.println("Enter Age");
//
//			String str = scan.next();
//			age = Byte.parseByte(str);
//
//		} catch (NumberFormatException e) {
//			// TODO: handle exception
//
//			System.out.println("Invalid age");
//			getStudentAge();
//		}
//		return age;
//	}
//
//}
	public byte getStudentAge() {
		try {
			scan = new Scanner(System.in);
			System.out.println("Enter Age");
			String str = scan.next();
			age = Byte.parseByte(str);
			new ValidateAge().validateAge(age);
		} catch (NumberFormatException | InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("Invalid Age");
			getStudentAge();
		}
		return age;
	}

	public String getStandard() {
		// TODO Auto-generated method stub

		scan = new Scanner(System.in);
		System.out.println("Enter Standard");
		String standard = scan.next();

		return standard;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		scan = new Scanner(System.in);
		System.out.println("Enter Address");
		String address = scan.next();
		return address;
	}
}
