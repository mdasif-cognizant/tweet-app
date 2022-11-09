package com.student_mgmt.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

}
