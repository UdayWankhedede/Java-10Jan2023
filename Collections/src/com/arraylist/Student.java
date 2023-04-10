package com.arraylist;

class StudentX
{
	private int id;
	private String name;
	private float marks;
	
	public StudentX()
	{
		
	}
	public StudentX(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentX [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


	
}
