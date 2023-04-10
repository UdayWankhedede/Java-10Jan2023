package com.exception;

public class ExceptionDemo1 
{
	public static void main(String[] args) {
		
//		float a = 90;
//		float b = 0;
//		float c = a/b; //in float condition it gives infinity
//		System.out.println(c);
		
		int a = 90;
		int b = 0;
		try {
		int c = a/b; //in float condition it gives infinity
		}
		catch(ArithmeticException e )
		{
		System.out.println("cannot divide by " +b);
		System.out.println(e);
		}
		
		System.out.println("hello");
		
	}

}
