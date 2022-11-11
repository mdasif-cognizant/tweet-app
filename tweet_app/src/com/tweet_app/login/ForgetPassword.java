package com.tweet_app.login;

import java.util.Scanner;

import com.tweet_app.connect.UserDAO;

public class ForgetPassword {
	static Scanner sc = new Scanner(System.in);
	UserDAO userDAO = new UserDAO();

	public void forgetPassword() {

		System.out.println("************* Forget Password ****************\n");
		System.out.println("");
		System.out.println("Enter your Email Id : ");
		String id = sc.next();
		boolean status = userDAO.validatePassword(id);
		if (status) {
			System.out.println("Enter new password : ");
			String newPassword = sc.next();
			boolean test = userDAO.resetPassword(newPassword, id);
			if (test) {
				System.out.println("Your password is successfully changed.");
			}

		} else {
			System.out.println("Warning!!!! Please Enter valid email-Id. \n");
		}

	}

}
