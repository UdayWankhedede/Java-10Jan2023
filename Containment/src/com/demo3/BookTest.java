package com.demo3;

public class BookTest 
{
	public static void main(String args[])
	{
	Author a1 = new Author("abcd",101,"10-2-20");
	
	Book bobj = new Book("xyz",50,"novel",a1);
	
	System.out.println(bobj);
}
}
