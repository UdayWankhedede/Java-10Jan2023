package com.demo2;

public class Department 
{
	private int did;
	private String dname;
	private String location;
	
	public Department()
	{
		System.out.println("Inside Department default constructor");
	}
	public Department(int did, String dname, String location)
	{
		System.out.println("Inside Department paramertirzed Construcor");
		this.did = did;
		this.dname = dname;
		this.location = location;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString()
	{
		return "Department details : " + " " + did + " " + dname + " " + location;
	}
}
