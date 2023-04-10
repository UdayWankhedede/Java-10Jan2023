package com.treemap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//To sort Employee using salary in ascending order of their salary using tree map comparable

public class EmployeeTreeMap {
	public static void main(String[] args) {
		//TreeMap<Employee, String> emap = new TreeMap<>(); it gives in increasing order
		TreeMap<Employee, String> emap = new TreeMap<>(Collections.reverseOrder());
		
		emap.put(new Employee(101,"Uday",50000),"IT");
		emap.put(new Employee(101,"Aditi",90000),"HR");
		emap.put(new Employee(101,"Piyush",70000),"Sales");
		emap.put(new Employee(101,"ADesh",40000),"IT");
		
		for(Map.Entry<Employee, String>en:emap.entrySet())
		{
			System.out.println(en.getKey());
		}
	}

}
