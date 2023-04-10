package com.source;

import java.util.Scanner;

class CourseMS {
	static Scanner scanobj = new Scanner(System.in);

	private int id = 0;
	private String name = null;
	static int Generator ;
	static 
	{
		Generator = 0;
	}

	public void StartCMS(Course c1[]) 
	{
		Scanner scanobj = new Scanner(System.in);
		for (int i = 0; i < c1.length; i++) 
		{
			c1[i] = new Course();
		}
		System.out.println("customised DBMS started succesfully....");
		System.out.println("10 = help");
		int Choice = 0;
		while (true) {
			System.out.print(" DBMS console >  ");
			Choice = scanobj.nextInt();

			if (Choice == 1) {
				InsertData(c1);

			} else if (Choice == 2) {
				Display(c1);

			} else if (Choice == 3) {
				DisplayWithId(c1);

			} else if (Choice == 4) {
				UpdateCourseName(c1);

			} else if (Choice == 5) {
				deleteCourseUsingId(c1);

			}
			else if(Choice == 0)
			{
				System.out.println("Thank your for using Student DBMS");
				break;
			}
			else if( Choice == 10)
			{
				System.out.println("Student DBMS console >");
				System.out.println("1 - Add Student");
				System.out.println("2 - Display Student");
				System.out.println("3 - Display Student using id ");
				System.out.println("4 - Update Student");
				System.out.println("5 - Delete Stduent id");
				System.out.println("0 - Exit");
				System.out.println("10 - For help");
			}
			else {
				System.out.println("Invalid parameter");
			}
			

		}
	}

	public void UpdateCourseName(Course c1[]) {
		System.out.println("Entre the Course name");
		id = scanobj.nextInt();

		for (int i = 0; i < Generator; i++) 
		{
			if (c1[i].getCid() == id) 
			{
				System.out.println("Entre the Course name");
				String name = scanobj.next();
				c1[i].setCname(name);
				
				System.out.println("Entre the Course fees");
				float fees = scanobj.nextFloat();
				c1[i].setCfees(fees);
				break;
			}
		}
	}

	public void InsertData(Course c1[]) {
		for (int i = 0; i <Generator; i++) {
			System.out.println("Entre the id");
			c1[i].setCid(scanobj.nextInt());

			System.out.println("Entre the name");
			c1[i].setCname(scanobj.next());

			System.out.println("Entre the fees");
			c1[i].setCfees(scanobj.nextFloat());
		}
	}

	public void Display(Course ct[]) {
		for (int i = 0; i <Generator; i++) {
			System.out.println(ct[i]);
		}
	}

	public void DisplayWithId(Course c1[]) {
		System.out.println("Entre the id");
		id = scanobj.nextInt();
		for (int i = 0; i < Generator; i++) {
			if (c1[i].getCid() == id) {
				System.out.println(c1[i].toString());
			}
		}
	}

	public void deleteCourseUsingId(Course c1[]) {
		System.out.println("Entre the Course id");
		id = scanobj.nextInt();
		for (int i = 0; i < Generator; i++) {
			if (c1[i].getCid() == id) {
				System.out.println(c1[i].getCid() + " " + c1[i].getCname() + " " + c1[i].getCfees());
				for (int j = i; j < Generator - 1; j++) {
					c1[j] = c1[j + 1];
				}
				c1[Generator - 1] = null;
				System.out.println("Course " + id + "delete successfully");
				break;
			}
		}
	}
}

public class test {
	public static void main(String[] args) {
		CourseMS cobjMS = new CourseMS();
		Course[] c1 = new Course[3];

//		for (int i = 0; i < c1.length; i++) {
//			c1[i] = new Course();
//		}
		cobjMS.StartCMS(c1);
//		cobjMS.InsertData(c1);
//		cobjMS.Display(c1);
//		cobjMS.DisplayWithId(c1);
//		cobjMS.deleteCourseUsingId(c1);

//		cobjMS.UpdateCourseName(c1);
//		cobjMS.Display(c1);

	}

}
