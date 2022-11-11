package com.tweet_app.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.tweet_app.user.Tweet;

public class TweetDAO {

	private  Connection con = ConnectionProvider.createConnection();

	public  boolean postTweet(Tweet tweet) {

		boolean status = false;
		try {

			String query = "INSERT INTO `tweet_app`.`tweets` ( `email`, `tweet`) VALUES (?,?)";
			PreparedStatement psmt = con.prepareStatement(query);
			psmt.setString(1, tweet.getEmail());
			psmt.setString(2, tweet.getpost());

			psmt.executeUpdate();
			System.out.println("\nTweet :"+tweet.getpost());
			System.out.println("\nAwesome! Your tweet is posted Successfully.\n");
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;

	}

	public  boolean viewAllTweets() {
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

	public  boolean viewMyTweets(String userId) {
		boolean status = false;

		try {

			String query = String.format("SELECT tweet FROM tweets where email='%s'", userId);
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			if((!rs.isBeforeFirst() && rs.getRow() == 0)) {
				System.out.println("Sorry!!! You have not posted anything yet.");
			}

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

	public  boolean viewAllUsers() {
		boolean status = false;

		try {

			int count = 0;

			String query = "SELECT * FROM user";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				count += 1;
				String username = rs.getString(1);

				System.out.println(count + ". " + username);

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
