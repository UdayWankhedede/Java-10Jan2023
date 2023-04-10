package com.diamon;

public class School implements Student,Teacher {
	
	public void display()
	{
		Student.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {

      School s= new School();
      s.display();

	}

}
