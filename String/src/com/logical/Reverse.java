package com.logical;

import java.util.Scanner;

public class Reverse {
	
	public static String ReversString(String str)
	{
		char[] Arr = str.toCharArray();
		String reve = "";
		
		for(int i = Arr.length-1; i > 0; i--)
		{
			reve = Arr[i]+reve;
		}
		return reve;
	}
	
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string :");
		String str = sobj.nextLine();
		
		String iRet =ReversString(str);
		System.out.println(iRet);
	}
}
