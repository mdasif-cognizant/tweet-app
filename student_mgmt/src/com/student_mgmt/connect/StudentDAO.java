package com.student_mgmt.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.student_mgmt.student.Student;

public class StudentDAO {

	public static boolean addStudentToDB(Student student) {
		boolean status = false;

		try {

			Connection con = ConnectionProvider.createConnection();
			String query1 = "insert into students(sname,phone,scity)" + "values (?,?,?)";

			PreparedStatement psmt = con.prepareStatement(query1);

			// Setting values to Parameter
			psmt.setString(1, student.getStudentName());
			psmt.setString(2, student.getStudentPhone());
			psmt.setString(3, student.getStudentCity());

			psmt.executeUpdate();
			status = true;
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	public static boolean deleteStudentToDB(int studentID) {
		boolean status = false;

		try {

			Connection con = ConnectionProvider.createConnection();
			String query1 = "DELETE from Students where sid= ?";

			PreparedStatement psmt = con.prepareStatement(query1);

			// Setting values to Parameter
			
			psmt.setInt(1, studentID);

			psmt.executeUpdate();
			status = true;
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
		
		
	}

	public static boolean displayAllStudents() {
		
		boolean status = false;

		try {

			Connection con = ConnectionProvider.createConnection();
			String query1 = "SELECT * FROM students";

//			PreparedStatement psmt = con.prepareStatement(query1);
			Statement stmt =con.createStatement();
			ResultSet rs = stmt.executeQuery(query1);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name =rs.getNString(2);
				String phone =rs.getString(3);
				String city =rs.getString("scity");
				
				System.out.println("Student ID : "+id);
				System.out.println("Student Name : "+name);
				System.out.println("Student Phone : "+phone);
				System.out.println("Student City : "+city);
				System.out.println("");
				System.out.println("----------------------------------");
			}
			
			status = true;
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
		
		
	}

}
