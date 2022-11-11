package com.tweet_app.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tweet_app.connect.UserDAO;
import com.tweet_app.user.User;

public class UserDaoTest {

	UserDAO userDao;
	User user;

	@BeforeEach
	public void init() {
		user = new User("Ashutosh", "ashu@gmail.com", "1234");
		userDao = mock(UserDAO.class);
	}

	@Test
	public void testRegisterUesr() throws SQLException {
		when(userDao.registerNewUser(user)).thenReturn(true);
		boolean isValid = userDao.registerNewUser(user);
		assertEquals(isValid, true);

	}
	@Test
	public void testUserInValidate() throws SQLException {
		when(userDao.userValidate("12","12")).thenReturn(true);
		boolean isValid = userDao.userValidate("15","15");
		assertNotEquals(isValid, true);
		
	}
	@Test
	public void testUserValidate() throws SQLException {
		when(userDao.userValidate("12","12")).thenReturn(true);
		boolean isValid = userDao.userValidate("12","12");
		assertEquals(isValid, true);
		
	}
	@Test
	public void testValidatePassword() throws SQLException {
		when(userDao.validatePassword("12")).thenReturn(true);
		boolean isValid = userDao.validatePassword("12");
		assertEquals(isValid, true);
		
	}

}
