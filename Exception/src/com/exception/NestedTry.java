package com.exception;

public class NestedTry {
	
	public static void main(String[] args) {
		
		String arr[] = {"java", "python",null,"Devops"};
		
		try
		{
			for(int i =0; i<arr.length; i++)
			{
				System.out.println(arr[i].length());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
