package com.jdbcconnect;

import java.sql.Connection;

public class AccessDB {

	static Connection con = null;
	
//
	public AccessDB()
	{
		con = DBConnection.getConnection();
		System.out.println("Establish...");
	}
	
	
	public static void main(String[] args) {
		AccessDB obj = new AccessDB();
		
	}
}
