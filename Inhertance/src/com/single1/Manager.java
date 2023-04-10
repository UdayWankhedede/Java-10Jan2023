package com.single1;

public class Manager extends Employee {
	
	private float exp;
	private float bonus;
	private String position;
	
	public Manager()
	{
		
	}
	public Manager(float exp, float bonus , String position)
	{
		this.exp = exp;
		this.bonus = bonus;
		this.position = position;
	}
	public static void main(String args[])
	{
		Manager m1 =new  Manager();
	}

}
