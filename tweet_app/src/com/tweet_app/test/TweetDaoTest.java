package com.tweet_app.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tweet_app.connect.TweetDAO;
import com.tweet_app.user.Tweet;
import com.tweet_app.user.User;

public class TweetDaoTest {

	TweetDAO tweetDao;
	Tweet tweet;
	User user;

	@BeforeEach
	public void init() {
		user = new User("Ashutosh", "ashu@gmail.com", "1234");
		tweetDao = mock(TweetDAO.class);
	}

	@Test
	public void postTweetTest() throws SQLException {
		when(tweetDao.postTweet(tweet)).thenReturn(true);
		boolean isValid = tweetDao.postTweet(tweet);
		assertEquals(isValid, true);

	}

	@Test
	public void viewMyTweetTest() throws SQLException {
		when(tweetDao.viewMyTweets("mail")).thenReturn(true);
		boolean isValid = tweetDao.viewMyTweets("Hi");
		assertNotEquals(isValid, true);

	}
	
	@Test
	public void viewAllUserFalseTest() throws SQLException {
		when(tweetDao.viewMyTweets("mail")).thenReturn(true);
		boolean isValid = tweetDao.viewMyTweets("asif");
		assertNotEquals(isValid, true);

	}
	
	@Test
	public void viewAllUserTest() throws SQLException {
		when(tweetDao.viewMyTweets("mail")).thenReturn(true);
		boolean isValid = tweetDao.viewMyTweets("asif");
		assertNotEquals(isValid, true);

	}
}
