package com.student;

import java.util.Scanner;

public class StudentMethod {
	Scanner scanobj = new Scanner(System.in);
	private int id;
	static int Generator;
	static 
	{
		Generator = 0;
	}
	public void StartSDB(Student s1[]) 
	{
		for (int i = 0; i < s1.length; i++) 
		{
			s1[i] = new Student();
		}
		System.out.println("customised DBMS started succesfully....");
		System.out.println("10 = help");
		int Choice = 0;
		while (true) 
		{
			System.out.print(" DBMS console >  ");
			Choice = scanobj.nextInt();

			if (Choice == 1) {
				AddStudent(s1);

			} else if (Choice == 2) {
				Display(s1);

			} else if (Choice == 3) {
				DisplayUsingId(s1);

			} else if (Choice == 4) {
				updateStudent(s1);

			} else if (Choice == 5) {
				deleteStudentUsingId(s1);

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
			}
			else if(Choice == 0)
			{
				System.out.println("Thank your for using Student DBMS");
				break;
			}
			else 
			{
				System.out.println("Invalid parameter");
			}

		}
	}

	public void AddStudent(Student s1[]) 
	{
		for (int i = 0; i < Generator; i++) 
		{
			System.out.println("Entre the Student id");
			s1[i].setId(scanobj.nextInt());

			System.out.println("Entre the Stduent name");
			s1[i].setName(scanobj.next());

			System.out.println("Entre the Student age");
			s1[i].setAge(scanobj.nextInt());
		}
	}

	public void Display(Student s1[]) 
	{
		for (Student s : s1) {
			System.out.println(s);
		}
	}

	public void DisplayUsingId(Student s1[]) 
	{
		System.out.println("Entre the id");
		id = scanobj.nextInt();
		for (int i = 0; i < Generator; i++) {
			if (s1[i].getId() == id) {
				System.out.println(s1[i].toString());
			}
		}
	}
	
	public void deleteStudentUsingId(Student s1[])
	{
		System.out.println("Entre the Student id");
		id = scanobj.nextInt();
		boolean flag = false;
		for(int i =0; i < Generator; i++)
		{
			if(s1[i].getId() == id)
			{
				flag = true;
				System.out.println(s1[i].getId() + " " + s1[i].getName() + " " + s1[i].getAge());
				for(int j = i; i <Generator; j++)
				{
					s1[j] = s1[i+1];
				}
				s1[Generator-1] = null;
				System.out.println("Student " + id + "delete successfully");
				if(!flag)
				{
					System.out.println("Sudent not found");
				}
				break;
			}
		}
	}
	public void updateStudent(Student s1[])
	{
		System.out.println("Entre the Student id");
		id = scanobj.nextInt();
		for(int i = 0; i < Generator; i++)
		{
			if(s1[i].getId() == id)
			{
				System.out.println(s1[i].getName() + " :" + s1[i].getId() + ": " + s1[i].getAge());
				System.out.println("Enter student  Name: ");
				String name = scanobj.next();
				s1[i].setName(name);
				break;
			}
		}
	}
}