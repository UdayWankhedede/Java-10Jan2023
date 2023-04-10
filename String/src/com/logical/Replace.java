package com.logical;

import java.util.Scanner;

public class Replace {
	
	public static void ReplaceLetter(String str)
	{
		char ch [] = str.toCharArray();
	}

	public static void main(String arg[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string :");
		String str = sobj.nextLine();

		String newstr = str.replaceAll("\\s+", " "); // (\\s+ -> means more than one white space)
		// replacing multiple white space with one

	}
}
