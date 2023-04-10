package com.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		int arr[] = {4,5,7,0,3};
		try 
		{
			for(int i = 0; i <=arr.length; i++)
			{
				arr[i] = arr[i]/arr[i+1];
				System.out.println(arr[i]);
			}
		}
		
		catch(ArithmeticException obj)
		{
			System.out.println(obj);
		}
		System.out.println("hello");
	}
	
}
