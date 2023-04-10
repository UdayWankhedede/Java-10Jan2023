package com.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentCourseHashMap {
	
	public static void sortKey(HashMap<Student,Course> map)
	{
		ArrayList<Student> list = new ArrayList<>(map.keySet());
		
		//Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
				
		LinkedHashMap<Student,Course> lhm= new LinkedHashMap<>();
		for(Student s:list)
		{
			lhm.put(s, map.get(s));
		}
		
        for(Map.Entry<Student,Course> en:lhm.entrySet())
        {
        	System.out.println(en.getKey()+"  >>"+en.getValue());
        }

	}
	
	public static void sortValue(HashMap<Student,Course> map)
	{
		ArrayList<Course> al= new ArrayList<>(map.values());
		
		//System.out.println(al);
		
		Collections.sort(al);
		
		//System.out.println(al);
		
		LinkedHashMap<Student,Course> lhm= new LinkedHashMap<>();
		
		Student key;
		for(Course c:al)
		{
			for(Map.Entry<Student,Course> en:map.entrySet())
			{
				if(en.getValue().equals(c))
				{
				    key= en.getKey();
				    if(!lhm.containsKey(key))
				    {
				    	lhm.put(key, c);
				    }
				}
			}
		}
		
		for(Map.Entry<Student, Course> en:lhm.entrySet())
        {
        	System.out.println(en.getKey()+"  >>"+en.getValue());
        }
		
	}
	

	public static void main(String[] args) {
		
	Course c1= new Course(1,"Java",6000);
	Course c2= new Course(2,"Python",5000);
	Course c3= new Course(3,"Angular",9000);
	Course c4= new Course(4,"NodeJs",7000);

     HashMap<Student, Course> smap= new HashMap<>();
     
     smap.put(new Student(101,"Bhushan",89f),c1);
     smap.put(new Student(102,"Ajay",98.4f), c3);
     smap.put(new Student(103,"Sagar",78.4f),c2);
     smap.put(new Student(104,"Ratan",72f),c4);
     smap.put(new Student(105,"Vivek",72f), c1);
     
      sortKey(smap);
      
      System.out.println("===============================================");
      
      sortValue(smap);

	}

}
