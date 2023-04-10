package com.logical;

import java.util.Scanner;

public class SplitString {
	
	private static String st;

	public static void SplitString(String str)
	{
		String word = "";
		String splitstr[] = new String[20];
		int temp = 0;
		st = st+' '; //to get the last word
		for(int i =0; i<str.length();i++)
		{
			if(st.charAt(i)!=' ')
			{
				word=word+st.charAt(i);
			}
			else
			{
				splitstr[temp]=word;
				temp++;
				word = "";
			}
		}
		for(int i=0;i<temp; i++)
		{
			System.out.println(splitstr[i]);
		}
		System.out.println("Number of words :" +temp);
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string");
		String str = sobj.next();
		
		SplitString(str);
	}

}
