package com.single1;

public class Employee {
	private int eid;
	private String name;
	private float salary;
	static String compay = "HCL";
	
	public Employee()
	{	
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static String getCompay() {
		return compay;
	}

	public static void setCompay(String compay) {
		Employee.compay = compay;
	}
	

}
