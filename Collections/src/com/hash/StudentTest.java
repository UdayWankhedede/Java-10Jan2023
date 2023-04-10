package com.hash;

import java.util.HashMap;

public class StudentTest {
	public static void main(String[] args) {

		HashMap<Student, String > smap = new HashMap<>();
		
		smap.put(new Student(101,"bhushann",89f),"Java");
		}
}
