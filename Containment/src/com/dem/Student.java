package com.dem;

public class Student {
	private int sid;
	private String sname;
	private Course course;

	public Student() {
		System.out.println("inside defaut constructor");
	}

	public Student(int sid, String sname) {
		System.out.println("inside 1st parametrized constructor");
		this.sid = sid;
		this.sname = sname;
	}

	public Student(int sid, String sname, Course course) {
		this(sid, sname);
		System.out.println("inside 2nd parametrized constructor");
		this.course = course;
		;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSname() {
		return sname;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public String toString() {
		return "Student : " + sid + " " + sname + " " + course;
	}

}
