package com.demo;

class Person
{
	void Display()
	{
		System.out.println("I an a person");
	}
}
class Employee extends Person
{
	@Override
	protected void Display()
	{
		System.out.println("I an working person");
	}
}
class HomePerson extends Person
{
	@Override
	public void Display()
	{
		System.out.println("I am home person");
	}
}

public class OverridingDemo 
{

	public static void main(String[] args) 
	{
		Employee eobj = new Employee();
		eobj.Display();
		
		HomePerson p1= new HomePerson();
		p1.Display();
	}

}
