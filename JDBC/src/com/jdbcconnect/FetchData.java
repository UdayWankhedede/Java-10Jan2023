package com.jdbcconnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchData {
	
	static Connection con = null;
	Statement st;
	ResultSet rs;
	
//	Construcctor
	public FetchData()
	{
		con = DBConnection.getConnection();
	}
//Created method to fetch data
	public void fetchFacultyData()
	{
		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * from COURSE");
			
			while(rs.next())
			{
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				String duration = rs.getString(3);
				int fees = rs.getInt(4);
				int noOfStudents = rs.getInt(5);
				System.out.println("Id"+" | "+"Course"+" | "+"Duration"+" | "+"Fees"+"No oF Student >>>");
				System.out.println();
				
				System.out.println(cid + " "+cname+" "+duration+" "+fees+" "+noOfStudents );
				System.out.println();
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) 
	{
		FetchData obj = new FetchData();
		obj.fetchFacultyData();
	}
}
