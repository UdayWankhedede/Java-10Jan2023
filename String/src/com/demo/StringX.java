package com.demo;

public class StringX {
	
	public void DisplayDuplicate(String str1)
	{
		
	}
	
	public static void main(String[] args) {
		
		String str1 = "Java"; //String literal (pool)
		String str2 = "Java";
		String str3 = new String("Java"); //(heap)
		
		if(str1 == str3)
		{
			System.out.println("String is same");
		}
		else
		{
			System.out.println("String is different");
		}
		if(str1.equals(str3))
		{
			System.out.println("String is same");
		}
		else
		{
			System.out.println("String is different");
		}
	}

}
