package com.logical;

import java.util.Scanner;

public class ReplaceLetterNext {
	
	public static void Replace(String str)
	{
		char[] arr = str.toCharArray();
		for(int i  = 0; i < arr.length; i++)
		{
			arr[i] = (char)(arr[i]+1);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string :");
		String str = sobj.nextLine();
		
		Replace(str);
	}

}
