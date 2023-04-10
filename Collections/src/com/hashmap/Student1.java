package com.hashmap;

public class Student1 {
	
	private int sid;
	private String sname;
	private float marks;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int sid, String sname, float marks, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", course=";
	}
	
	
}
