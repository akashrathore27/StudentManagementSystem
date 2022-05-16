package com.assignment3;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

import com.assignment3.Student;

import StudentDaoModel.StudentDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while (choice != 3) {
			System.out.println("Press 1:For Add New Student Details");
			System.out.println("Press 2:For get Student Details");
			System.out.println("Press 3:For Exit ");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Student student = new Student();
				StudentDao studentDao = new StudentDao();
				studentDao.addRecords(student);
				break;
			case 2:

				StudentDao studentDao1 = new StudentDao();
				Student student1 = studentDao1.read();
				if (student1 != null) {
					System.out.println(student1);

				} else {
					System.out.println("Record Not Found");
				}
				System.out.println();

				break;
			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Please Enter Valid Input");
				break;
			}
		}

	}
}
