package com.demo;

public class StringPrograms {
	
	public static void printEvenChar(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
		}
		
	}

	public static void main(String[] args) {

       String s1="Hello Java";
       System.out.println(s1);
       printEvenChar(s1);
       
       //convert string to charcater array
       
       char ch[]= s1.toCharArray();

	}

}
