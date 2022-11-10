package com.tweet_app.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tweet_app.user.User;

public class UserDAO {

	private static Connection con = ConnectionProvider.createConnection();

	public static boolean registerNewUser(User user) throws SQLException {

		boolean status = false;
		try {

			String query = "INSERT INTO `tweet_app`.`user` (`username`, `email`, `password`) VALUES (?,?,?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, user.getUserName());
			psmt.setString(2, user.getEmail());
			psmt.setString(3, user.getPassword());

			psmt.executeUpdate();
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public static boolean userValidation(String userId, String pwd) {
		boolean status = false;
		try {

			String query = ("SELECT email,password FROM user ");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String email = rs.getString(1);
				String password = rs.getString(2);

				if (email.equals(userId) && password.equals(pwd)) {

					status = true;

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public static void resetPassword(String newPassword, String id) throws SQLException {

		String query = "update user set password=? where email=?";

		PreparedStatement psmt = con.prepareStatement(query);
		psmt.setString(1, newPassword);
		psmt.setString(2, id);

		psmt.executeUpdate();
		System.out.println("Password Updated Succcessfully");

	}

	public static boolean validatePassword(String id) {

		boolean status = false;
		try {

			String query = "SELECT email FROM user ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				String email = rs.getString(1);

				if (email.equals(id)) {

					status = true;

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

}
