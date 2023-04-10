package com.StringBuffer;

public class StringBufferDemo {

	public static void main(String[] args) 
	{
		
		StringBuffer sobj = new StringBuffer("Java");
		System.out.println(sobj.capacity());

		StringBuffer sobj1 = new StringBuffer();
		System.out.println(sobj1.capacity());
		
		sobj.append(" Programs");
		System.out.println(sobj);
		
		sobj.insert(4, " has");
		System.out.println(sobj);
		
		sobj.replace(4, 8, " gives");
		System.out.println(sobj);
		
		sobj.delete(5, 8);
		System.out.println(sobj);
		
		sobj.reverse();
		System.out.println(sobj);
		
		
	}

}
