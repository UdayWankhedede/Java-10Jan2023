package com.hashmap;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private float marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Float.floatToIntBits(marks) == Float.floatToIntBits(other.marks)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
		
		if(this.marks==s.marks)
			return this.name.compareTo(s.name);
		else
			if(this.marks>s.marks)
				return 1;
			else
				 return -1;
			


	}
	
	
	

}
