package com.custommap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentCourseHash {
	
	public static void createStudentCourseMap(ArrayList<Student>blist)
	{
		HashMap<String , ArrayList<String>> studentmap = new HashMap<>(); 
	
		Iterator<Student> itr = blist.iterator();
		
		ArrayList<String > studentlist;
		
		while(itr.hasNext())
		{
			
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Student> blist = new ArrayList<>();
		
		blist.add(new Student(101,"Uday",new Course(1, "MCA",75000)));
		blist.add(new Student(102,"Aditi",new Course(1, "BE",155000)));
		blist.add(new Student(103,"Piyush",new Course(1, "BCA",80000)));
		blist.add(new Student(104,"Adesh",new Course(1, "BMS",55000)));
		blist.add(new Student(105,"Ashu",new Course(1, "EVENT",15000)));
	}

}
