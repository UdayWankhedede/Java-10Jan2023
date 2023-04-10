package com.containment;

public class Course 
{
	private int cid;
	private int cname;
	
	public Course()
	{
		System.out.println("inside course default const ");
	}
	
	public Course(int cid,int cname)
	{
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCname() {
		return cname;
	}

	public void setCname(int cname) {
		this.cname = cname;
	}
	
}
