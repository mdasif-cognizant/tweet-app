package com.tweet_app.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tweet_app.user.Tweet;

public class TweetDAO {

	private static Connection con = ConnectionProvider.createConnection();

	public static boolean postTweet(Tweet tweet) {

		boolean status = false;
		try {

			String query = "INSERT INTO `tweet_app`.`tweets` ( `email`, `tweet`) VALUES (?,?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, tweet.getEmail());
			psmt.setString(2, tweet.getpost());

			psmt.executeUpdate();
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public static boolean viewAllTweets() {
		boolean status = false;

		try {

			String query = "SELECT * FROM tweets";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				String email = rs.getNString(1);
				String tweet = rs.getString(2);

				System.out.println("user : " + email);
				System.out.println("Tweet : " + tweet);
				System.out.println("");
				System.out.println("----------------------------------");
			}

			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	
	public static boolean viewMyTweets(String userId) {
		boolean status = false;

		try {

			String query = String.format("SELECT tweet FROM tweets where email=%s", userId);
			System.out.println(query);

			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {

				
				String tweet = rs.getString(1);

				
				System.out.println("Tweet : " + tweet);
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
