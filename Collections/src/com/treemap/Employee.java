package com.treemap;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private float Salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
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

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}

	@Override
	public int compareTo(Employee o) {

		if (this.Salary < o.Salary)
			return -1;
		else if (this.Salary > o.Salary)
			return 1;
		else
			return 0;

	}

}
