package com.varags;

public class VaragsWrapper2 {
	/*
	public static void display(Object ...x)
	{		
		System.out.println("Object");
		for(Object c:x)
		{
			System.out.println(c);
		}
		
	}	
	
	public static void display(Number ...x)
	{	
		System.out.println("Number");
		for(Number c:x)
		{
			System.out.println(c);
		}
	}
	*/
	public static void display(Double...x)
	{	
		System.out.println("Double");
		for(Double c:x)
		{
			System.out.println(c);
		}
	}
	
	public static void display(Character ...x)
	{
	    System.out.println("Character");
		for(char ch:x)
		{
			System.out.println(ch);
		}
		
	}
	
	
	public static void main(String[] args) {

  //  display(6.7f,4.5f,8f,8f);

	}

}
