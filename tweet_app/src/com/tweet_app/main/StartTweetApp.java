package com.tweet_app.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.tweet_app.connect.TweetDAO;
import com.tweet_app.connect.UserDAO;
import com.tweet_app.user.Tweet;
import com.tweet_app.user.User;

public class StartTweetApp {

	public static void main(String[] args) throws SQLException {
		boolean stop = true;
		;
		Scanner sc = new Scanner(System.in);

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

				String name;
				String password;
				String email;
				System.out.println("*********** Registration ***********\n");
				System.out.println("");

				System.out.println("Enter your desired username :         ");
				name = sc.next();
				System.out.println("Enter your desired password :          ");
				password = sc.next();
				System.out.println("Enter your Email Id :                 ");
				email = sc.next();

				User user = new User(name, email, password);
				boolean status = UserDAO.registerNewUser(user);
				if (status) {
					System.out.println("Congratulations! You are Successfully Registerd in Tweet App.");
				} else {
					System.out.println("OOPs!!! Somthing went wrong, Please try again or Contacat to Admin.");
				}

				break;
			}

			case 2: {
				System.out.println("************* Login ****************\n");
				System.out.println("");
				System.out.println("Enter your Login ID (Email-ID) :         ");
				String userId = sc.next();
				System.out.println("Enter your password :                 ");
				String pwd = sc.next();

				boolean valid = UserDAO.userValidate(userId, pwd);
				if (valid) {
					System.out.println("Login in successfully ");
					while (true) {

						System.out.println("          1.Post Tweet                           ");
						System.out.println("          2.View my Tweets                       ");
						System.out.println("          3.View all Tweets   		             ");
						System.out.println("          4.View all Users                       ");
						System.out.println("          5.Reset Password                       ");
						System.out.println("          6.Logout                      ");
						System.out.println("");
						System.out.println("********************************************\n");
						System.out.println("");

						System.out.println("Select any option : ");
						int select = sc.nextInt();
						if (select == 1) {
							// post tweet
							System.out.println("Welcome!!! You can Post here........");
							System.out.println("tweet : ");
							String post = sc.next();
							post += sc.nextLine();

							Tweet newtweet = new Tweet(userId, post);

							TweetDAO.postTweet(newtweet);

						} else if (select == 2) {
							// view my tweet
							TweetDAO.viewMyTweets(userId);
						} else if (select == 3) {
							// view all tweet
							TweetDAO.viewAllTweets();
						} else if (select == 4) {
							// view all users
							TweetDAO.viewAllUsers();
						} else if (select == 5) {
							// reset password
							System.out.println("--------------Reset Your Password-----------------\n");
							System.out.println("Enter your old password :");
							String oldPassword = sc.next();
							boolean test = UserDAO.resetOldPassword(userId, oldPassword);
							if (test) {
								System.out.println("Enter new password");
								String newPassword = sc.next();
								boolean changed = UserDAO.resetPassword(newPassword, userId);
								if (changed) {
									System.out.println("Your password is successfully changed.");
								}
							} else {
								System.out.println("Your entered password is incorrect.");
							}

						} else if (select == 6) {
							// logout
							System.out.println("You have been logged out successfully.");
							break;
						}

					}

				} else {
					System.out.println("Login ID or Password Incorrect.");
				}

				break;
			}
			case 3:
				// Forget Password

				System.out.println("************* Login ****************\n");
				System.out.println("");
				System.out.println("Enter your Login ID (Email) :         ");
				String id = sc.next();
				boolean status = UserDAO.validatePassword(id);
				if (status) {
					System.out.println("Enter new password : ");
					String newPassword = sc.next();
					boolean test = UserDAO.resetPassword(newPassword, id);
					if (test) {
						System.out.println("Your password is successfully changed.");
					}

				} else {
					System.out.println("Warning!!!! Please Enter valid Email-Id : \n");
				}
				break;

			case 4:
				// Exit from application
				stop = false;
				break;
			default:
				System.out.println("WARNING!!!!  Please Choose Correct Option.");

			}

		}
		System.out.println("----------------------------------------");
		System.out.println("Thank You for using Tweet Application.\n" + "!!!!!!!!!!!!******************!!!!!!!!!!!\n");

	}

}
