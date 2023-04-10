package com.containment;

public class Student 
{
	private int id;
	private String name;
	private float marks[];
	private Course course;
	private int total;
	
	
	public Student() 
	{
	}


	public Student(int id, String name, float[] marks, Course course, int total) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
		this.total = total;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name = name;
	}
	public float[] getMarks()
	{
		return marks;
	}
	public void setMarks()
	{
		this.marks = marks;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse()
	{
		this.course = course;
	}
	public int getTotal()
	{
		return total;
	}
	public void setTotal()
	{
		this.total = total;
	}
	
	public String toString()
	{
		return "Details of Student " +" "+id + " "+name+" " +marks+" "+course +" "+ total;
	}
}
