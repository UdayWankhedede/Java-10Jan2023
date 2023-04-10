package com.demo;
import java.util.*;
import java.io.*;

//take string from user and count number of words
//this program handle multiple white space

class CountWord2

{
	
//	public static void CountWords(String str)
//	{
//		int iCnt = 0;
//		char arr[] = str.toCharArray();
//		for(int i = 0; i <arr.length; i++)
//		{
//			if(arr[i] != ' ')
//			{
//				iCnt++;
//			}
//		}
//		System.out.println(iCnt);
//			
//	}
	public static void CountWords(String str)
	{
		int iCnt = 1;
		for(int i = 0; i <str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				iCnt++;
			}
		}
		System.out.println(iCnt);
			
	}
	public static void main(String arg[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string :");
		String str = sobj.nextLine();
//
//		String newstr = str.replaceAll("\\s+", " "); // (\\s+ -> means more than one white space)
//		// replacing multiple white space with one
//
//		String arr[] = newstr.split(" "); // delimiter means kuthe todach ahe string
//		// aplyal space pasun todach ahe
//
//		System.out.println("number of words :" + arr.length); // due to array we use property(arr.length)
//		// if it is string we use arr.length(); which is method

		CountWords(str);
	}
}