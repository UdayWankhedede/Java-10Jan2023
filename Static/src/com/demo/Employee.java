package com.demo;

public class Employee {
	
   private int eid;
   private String ename;
   private float salary;
   
   public static String company="Microsoft";
   public static int empCount=0;
   
   // instance block
   static
   {
	   empCount++;
   }
   
	public Employee() {
	
		//empCount++;
    }
	
	public Employee(int eid, String ename, float salary) {
		
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		//empCount++;
	}
	


//	public int getEid() {
//		return eid;
//	}
//
//
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//
//
//	public String getEname() {
//		return ename;
//	}
//
//
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//
//
//	public float getSalary() {
//		return salary;
//	}
//
//
//	public void setSalary(float salary) {
//		this.salary = salary;
//	}
//
//
//	public static String getCompany() {
//		return company;
//	}
//
//
//	public static void setCompany(String company) {
//		Employee.company = company;
//	}
//	
//	
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
//	}


}
