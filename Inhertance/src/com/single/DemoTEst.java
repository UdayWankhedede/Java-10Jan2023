package com.single;

class One
{
	protected int data;
	
	public One()
	{
		System.out.println("Inside default constructor");
	}
	
	public One(int data)
	{
		System.out.println("Inside parametrized constructor");
		this.data =data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public String toString()
	{
		return "One class data is  : " + data;
	}
}

class Two extends One 		//here class two inherited class one
{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void Display()
	{
		System.out.println(name + " " + data);
	}
	
	public String getName()
	{
		return name;
	}
}

public class DemoTEst 
{
	public static void main(String args[])
	{
		One obj = new One(); //here we create object of class one
		obj.setData(34);
		obj.getData();
		
		Two tobj = new Two();
		tobj.setData(56);
		tobj.setName("Husky");
		
		System.out.println(obj.getData());
		System.out.println(tobj.getData() + " " + tobj.getName());
		
	}
}
