package com.demo;

public class EmployeeTest {

	public static void main(String[] args) {

	System.out.println("Number of employee:"+Employee.empCount);	
    Employee e1= new Employee(1,"Tina",908776f);
    Employee e2= new Employee(2,"Vina",90876f);
    Employee e3= new Employee();
    
    System.out.println("Number of employee:"+Employee.empCount);

	}

}
