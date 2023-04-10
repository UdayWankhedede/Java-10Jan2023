package com.demo;

public class WrapperDemo {

	public static void main(String[] args) {

	      int a=20;
	      Integer i1 = new Integer(10); //explicitly
	      i1= Integer.valueOf(a);
	      
	      // autoboxing: convert primitive to integer
	      
	      Integer i2= a;
	}
}
