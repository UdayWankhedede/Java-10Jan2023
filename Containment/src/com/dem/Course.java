package com.dem;

public class Course 
{
	private int cid;
	private String cname;
	private float courseFees;
	
	public Course()
	{
		System.out.println("inside default constructor");
	}
	public Course(int cid, String cname, float courseFees)
	{
		this.cid = cid;
		this.cname = cname;
		this.courseFees = courseFees;
	}
	public void setCid(int cid) 
	{
		this.cid = cid;
	}
	public int getCid() 
	{
		return cid;
	}
	public void setCname(String cname) 
	{
		this.cname = cname;
	}
	public String getCname() 
	{
		return cname;
	}
	public void setCourseFees(float courseFees) 
	{
		this.courseFees = courseFees;
	}
	
	public float getCourseFees() 
	{
		return courseFees;
	}
//	public String toString() {
//		return "Course [cid=" + cid + ", cname=" + cname + ", courseFees=" + courseFees + "]";
//	}
	public String toString()
	{
		return "Course:"+cid+"  "+cname+" "+courseFees;
	}
		
}
