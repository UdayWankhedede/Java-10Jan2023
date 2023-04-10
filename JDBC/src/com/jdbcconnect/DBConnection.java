package com.jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/studentdb";
	public static final String USER = "root";
	public static final String PASS = "UDAY@1697";
	
	static Connection con = null;
	
	public static Connection getConnection()
	{
		try{
//			here we loaded the JDBC_DRIVER of database
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded successfully");
			
			System.out.println("Connecting to database...");
			 // here we connect to DriverManager 
			con = DriverManager.getConnection(JDBC_URL,USER,PASS);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e);
		}
		return con;
	}

//	public static void main(String args[])
//	{
//		getConnection();
//	}
}
