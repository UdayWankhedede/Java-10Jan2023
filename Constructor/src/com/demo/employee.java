package com.demo;

public class employee {
	
	//class characterstics
	private int eid;
	private String name;
	private float salary;
	
	public employee()
	{
		System.out.println("defaukt constructor");
		this.eid = eid;
		this.name = null;
		
	}
	public employee(int eid, String name, float salary)
	{
		this();
		System.out.println("Para constructor");
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println(eid + name + salary);
	}

}
