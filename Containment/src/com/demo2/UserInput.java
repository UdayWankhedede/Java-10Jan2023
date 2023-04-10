package com.demo2;

import java.util.*;

public class UserInput {
	public static void main(String args[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("========Department 1=======");
		Department dobj = new Department();

		System.out.println("Entre the department id");
		dobj.setDid(sobj.nextInt());

		System.out.println("Entre department name");
		dobj.setDname(sobj.next());

		System.out.println("Location:");
		dobj.setLocation(sobj.next());
		
		System.out.println("========Department 2=======");
		Department dobj2 = new Department();

		System.out.println("Entre the department id");
		dobj2.setDid(sobj.nextInt());

		System.out.println("Entre department name");
		dobj2.setDname(sobj.next());

		System.out.println("Location:");
		dobj2.setLocation(sobj.next());
		

		System.out.println("========Employee=======");
		
		Employee eobj= new Employee();
	     System.out.println("Enter the employee id:");
	     eobj.setEid(sobj.nextInt());
	     
	     System.out.println("Enter the employee name:");
	     eobj.setEname(sobj.next());
	     
	     System.out.println("Enter salary:");
	     eobj.setSalary(sobj.nextFloat());
	     
	     System.out.println("Enter the department id :");
	     int deptid= sobj.nextInt();
	     
	     if(deptid == dobj.getDid())
	     {
	    	 eobj.setDept(dobj);
	     }
	     if(deptid == dobj2.getDid())
	     {
	    	 eobj.setDept(dobj2);
	     }
	System.out.println(eobj);
	}
	

}
