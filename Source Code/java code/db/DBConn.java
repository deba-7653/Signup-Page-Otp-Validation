package com.db;

import java.sql.DriverManager;

import java.sql.Connection;

public class DBConn {
	private static Connection conn;
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Signup";

	private static final String DB_UNAME = "Debadutta";

	private static final String DB_PWD = "7653";
	
	public static Connection getConn() {
		try {
			Class.forName ("com.mysql.cj.jdbc.Driver");
			  conn = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	

}
