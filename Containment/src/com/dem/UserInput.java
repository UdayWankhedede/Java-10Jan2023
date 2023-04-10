package com.dem;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Course c1 = new Course(101, "Java", 89000f);
		Course c2 = new Course(102, ".net", 78000f);
		Course c3 = new Course(103, "Python", 89666f);

		Student sobj = new Student();
		System.out.println("Entre the student id ");
		sobj.setSid(sc.nextInt());
		
		System.out.println("Entre the student name");
		sobj.setSname(sc.next());
		
		
		
		
	}

}
