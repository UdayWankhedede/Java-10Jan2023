package com.demo2;

public class EmployeeTest {

	public static void main(String[] args) {

		Department d1 = new Department(101, "HR", "Delhi"); // here we create department class object
		Department d2 = new Department(102, "Sales", "Mumbai");

		Employee e1 = new Employee(1, "Sagar", 89000f, d1); //here we pass the object of department class as a parameter
		Employee e2 = new Employee(2, "Priya", 25000f, d2);
		Employee e3 = new Employee(3, "Pritish", 56000f, d2);
		Employee e4 = new Employee(4, "Tejas", 67000f, d1);

		System.out.println(e1.getDept().getDname());
		System.out.println(d1.getDname());

		if (e1.getSalary() > 50000) {
			System.out.println(e1);
		}
		if (e2.getSalary() > 50000) {
			System.out.println(e2);
		}
		if (e3.getSalary() > 50000) {
			System.out.println(e3);
		}
		if (e4.getSalary() > 50000) {
			System.out.println(e4);
		}

	}

}
