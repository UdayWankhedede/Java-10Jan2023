package com.dem;

public class StudentTest {

	public static void main(String[] args) {

		Course c1 = new Course(101, "Java", 89000f);
		Course c2 = new Course(102, ".net", 78000f);
		Course c3 = new Course(103, "Python", 89666f);

		Student s1 = new Student(1, "Sagar", c1);
		Student s2 = new Student(2, "Adinath", c1);
		Student s3 = new Student(3, "Vivek", c2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("-----------------------------------------------");

		c1.setCname("Core Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("-----------------------------------------------");
		Student s4 = new Student(4, "Priya");
		System.out.println(s4);
		s4.setCourse(c3); // here we try to set another course by passing c3
		System.out.println(s4);

		System.out.println("-----------------------------------------------");
		s4.setCourse(c2); // here we try to set another course by passing c2
		System.out.println(s4);

	}

}
