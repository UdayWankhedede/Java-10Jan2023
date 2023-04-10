package com.demo;
import java.util.*;
import java.io.*;

//take string from user and count number of words
//this program handle multiple white space

class CountWord
{
	public static void main(String arg[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string :");
		String str = sobj.nextLine();

		String newstr = str.replaceAll("\\s+", " "); // (\\s+ -> means more than one white space)
		// replacing multiple white space with one

		String arr[] = newstr.split(" "); // delimiter means kuthe todach ahe string
		// aplyal space pasun todach ahe

		System.out.println("number of words :" + arr.length); // due to array we use property(arr.length)
		// if it is string we use arr.length(); which is method

	}
}