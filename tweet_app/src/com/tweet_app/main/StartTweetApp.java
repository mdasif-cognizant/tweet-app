package com.tweet_app.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.tweet_app.login.ForgetPassword;
import com.tweet_app.login.Login;
import com.tweet_app.login.Registration;

public class StartTweetApp {

	public static void main(String[] args) throws SQLException {
		boolean stop = true;
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		ForgetPassword forget = new ForgetPassword();
		Registration registerUser = new Registration();

		System.out.println("*********** Welcome to Tweet App ***********\n");

		while (stop) {
			System.out.println("          1.Register                          ");
			System.out.println("          2.Login                             ");
			System.out.println("          3.Forgot Password   		          ");
			System.out.println("          4.Exit                              ");
			System.out.println("");
			System.out.println("********************************************\n");
			System.out.println("");

			System.out.println("Select any option : ");
			int choose = sc.nextInt();

			switch (choose) {

			case 1: {
				registerUser.userRegistration();
				break;
			}

			case 2: {
				login.loginUser();
				break;
			}
			// Forget Password
			case 3:
				forget.forgetPassword();
				break;
			// Exit from Application
			case 4:
				stop = false;
				break;
			default:
				System.out.println("WARNING!!!!  Please Choose Correct Option.");
			}

		}
		sc.close();
		System.out.println("----------------------------------------");
		System.out.println("Thank You for using Tweet Application.\n" + "!!!!!!!!!!!!******************!!!!!!!!!!!\n");

	}

}
