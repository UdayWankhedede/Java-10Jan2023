package com.demo;

class SuperDemo 
{
	public int i;
	public int j;
	
	public SuperDemo(int a , int b)
	{
		this.i = a;
		this.j = b;
	}
	public void fun()
	{
		System.out.println("Inside base fun");
	}
}
class SuperDemo1 extends SuperDemo
{
	public int x;
	public int y;
	
	public SuperDemo1()
	{
		super(11,31); // here we call the base class constructor
	}
	
	public void sun()
	{
		System.out.println("inside sun method");
		
		System.out.println(super.i+" "+" "+super.j); // here we access base class 

		super.fun(); //here we call base class function
		
	}
}
