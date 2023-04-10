package com.arrayofobject;

public class Subject {
	
	private int subid;
	private String subName;
	private float marks;
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subid, String subName, float marks) {
		super();
		this.subid = subid;
		this.subName = subName;
		this.marks = marks;
	}
	public int getSubid() {
		return subid;
	}
	public void setSubid(int subid) {
		this.subid = subid;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Subject [subid=" + subid + ", subName=" + subName + ", marks=" + marks + "]";
	}
	
	

}
