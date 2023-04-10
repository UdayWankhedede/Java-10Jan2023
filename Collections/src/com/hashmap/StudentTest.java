package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentTest {

	public static void searchStudent(HashMap<Student, String> map) {

		String name = "uday";
		Student s = null;
		String course = null;
		for (Map.Entry<Student, String> en : map.entrySet()) {
			s = en.getKey();
			if (s.getName().equals(name)) {
				course = en.getValue();
			}
		}
		if (course != null) {
			System.out.println(name + " has applied for " + course);
		} else {
			System.out.println("No record found");
		}
	}

	public static void main(String[] args) {
		HashMap<Student, String> smap = new HashMap<>();

		smap.put(new Student(101, "bhushan", 23), "BCA");
		smap.put(new Student(102, "uday", 24), "MCA");
		smap.put(new Student(103, "aditi", 22), "BE");
		smap.put(new Student(104, "piyush", 25), "MTECH");

		searchStudent(smap);

	}

}
