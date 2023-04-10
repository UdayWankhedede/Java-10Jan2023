package com.demo2;

public class Employee {
	private int eid;
	private String ename;
	private float salary;
	private Department dept; //Instance of class DEpartment means non static member

	public Employee() {
		System.out.println("Inside employee default Constructor");
	}

	public Employee(int eid, String ename, float salary, Department dept) {
		System.out.println("inside employee parametrized constructor");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Employee details : " + eid + " " + ename + " " + salary + "  " + dept;

	}

}
