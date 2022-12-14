package com.student_mgmt.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student_mgmt.connect.StudentDAO;
import com.student_mgmt.student.Student;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("\nWelcome to Student Management Application\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			System.out.println("press 1 to Add student :");
			System.out.println("press 2 to Delete student :");
			System.out.println("press 3 to Display student :");
			System.out.println("press 4 to Exit :");

			int choice = Integer.parseInt(br.readLine());

			// Adding Student
			if (choice == 1) {
				System.out.println("Enter Student Name- :");
				String name = br.readLine();
				System.out.println("Enter Student Phone Number :");
				String phone = br.readLine();
				System.out.println("Enter Stiudent City");
				String city = br.readLine();

				Student std = new Student(name, phone, city);

				boolean status = StudentDAO.addStudentToDB(std);
				if (status) {
					System.out.println("\nNew Student is Created:\n");
				} else {
					System.out.println("OOPs! Data is not added, Please try again or Contact to system Admin.\n");
				}

				// Deleting Student
			} else if (choice == 2) {

				System.out.println("Enter ID of Student :");
				int studentID = Integer.parseInt(br.readLine());
				boolean status = StudentDAO.deleteStudentToDB(studentID);

				if (status) {
					System.out.println("\nStudent is Deleted Successfully:");
				} else {
					System.out.println("\nOOPs! Data is not Deleted, Please try again or Contact to system Admin.");

				}
			}

			else if (choice == 3) {

				boolean status = StudentDAO.displayAllStudents();

				if (!status) {
					System.out.println("\nOOPs! Data is not Found, Please try again or Contact to system Admin.");
				} 

			} else if (choice == 4) {

				break;
			} else {

			}
			
		}
		System.out.println("\nThank You for using Student Management Application\n");

	}

}
