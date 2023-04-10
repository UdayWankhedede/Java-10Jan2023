package com.demo;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s3 = new Student(); //Creating 3 object
		Student s2 = new Student(100,"Uday");
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("=====Entre for 1st student=====");
		System.out.println("Entre student id");
		s1.setId(sobj.nextInt());
		System.out.println("Entre student id");
		s1.setName(sobj.next());
		
//		System.out.println(s1);		
//		System.out.println(s2);
		
		s2.Details();
		
		System.out.println("=====Entre for next student=====");
		System.out.println("Entre student id");
		s3.setId(sobj.nextInt());
		System.out.println("Entre student id");
		s3.setName(sobj.next());
		
		s3.Details();
		

	}

}
