package com.tweet_app.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection getCon() {
		try {
			String url = "jdbc:mysql://localhost:3306/";

			String uname = "admin";
			String pass = "admin";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			return con;
		} catch (Exception e) {
			return null;
		}
	}

}

//jdbc:mysql://localhost:3306/?user=root
	
