package com.demo;

public class Student {
	
	private int id;
	private String name;
	
	public Student() 
	{
		System.out.println("Inside default constructor");
		this.id = 0;
		this.name = null;
	}
	public Student(int id , String name)
	{
		System.out.println("Inside parametrized constructor");
		this.id = id;
		this.name = name;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public String tostring()
	{
		return "Student details" + id + name;
	}
	public void Details()
	{
		System.out.println(this.id + " " + this.name);
	}
	
	

}
