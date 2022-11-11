package com.tweet_app.login;

import java.util.Scanner;

import com.tweet_app.connect.TweetDAO;
import com.tweet_app.connect.UserDAO;
import com.tweet_app.user.Tweet;

public class Login {
	static Scanner sc = new Scanner(System.in);
	TweetDAO tweetDAO = new TweetDAO();
	UserDAO userDAO = new UserDAO();

	public  void loginUser() {

		System.out.println("************* Login ****************\n");
		System.out.println("");
		System.out.println("Enter your Login ID (Email-ID) :         ");
		String userId = sc.next();
		System.out.println("Enter your password :                 ");
		String pwd = sc.next();

		boolean valid = userDAO.userValidate(userId, pwd);
		if (valid) {

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

				// Post New Tweet
				if (select == 1) {
					System.out.println("Welcome!!! You can Post here........");
					System.out.println("tweet : ");
					String post = sc.next();
					post += sc.nextLine();
					Tweet newtweet = new Tweet(userId, post);
					tweetDAO.postTweet(newtweet);

				// View My Tweets
				} else if (select == 2) {
					tweetDAO.viewMyTweets(userId);

				// view all tweet
				} else if (select == 3) {
					tweetDAO.viewAllTweets();

				// View all users
				} else if (select == 4) {
					tweetDAO.viewAllUsers();

				// Reset password
				} else if (select == 5) {

					System.out.println("--------------Reset Your Password-----------------\n");
					System.out.println("Enter your old password :");
					String oldPassword = sc.next();
					boolean test = userDAO.resetOldPassword(userId, oldPassword);
					if (test) {
						System.out.println("Enter new password");
						String newPassword = sc.next();
						boolean changed = userDAO.resetPassword(newPassword, userId);
						if (changed) {
							System.out.println("Your password is successfully changed.");
						}
					} else {
						System.out.println("Your entered password is incorrect.");
					}
				//Logout
				} else if (select == 6) {
					
					System.out.println("You have been logged out successfully.");
					break;
				}

			}

		} else {
			System.out.println("Login ID or Password Incorrect.");
		}

	}

}
