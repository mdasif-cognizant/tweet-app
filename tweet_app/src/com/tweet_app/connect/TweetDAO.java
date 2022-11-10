package com.tweet_app.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

}
