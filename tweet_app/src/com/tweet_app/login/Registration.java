package com.tweet_app.login;

import java.sql.SQLException;
import java.util.Scanner;

import com.tweet_app.connect.UserDAO;
import com.tweet_app.user.User;

public class Registration {
	static Scanner sc = new Scanner(System.in);

	public static void userRegistration() throws SQLException {

		System.out.println("*********** Registration ***********\n");
		System.out.println("");

		System.out.println("Enter your desired username :         ");
		String name = sc.next();
		System.out.println("Enter your desired password :          ");
		String password = sc.next();
		System.out.println("Enter your Email Id :                 ");
		String email = sc.next();

		User user = new User(name, email, password);
		boolean status = UserDAO.registerNewUser(user);
		if (status) {
			System.out.println("Congratulations! You are Successfully Registerd in Tweet App.");
		} else {
			System.out.println("OOPs!!! Somthing went wrong, Please try again or Contacat to Admin.");
		}

	}

}
