package com.demo;

import java.util.Scanner;

public class CountChar {

	public static void CountChar(String str) {
		char arr[] = str.toCharArray();
		int iCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				iCnt++;
			}
		}

		System.out.println(iCnt);
	}

	public static void main(String args)
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string :");
		String str = sobj.nextLine();
		
		CountChar(str);
	}

}
