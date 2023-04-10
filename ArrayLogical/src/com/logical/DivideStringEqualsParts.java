package com.logical;

import java.util.Arrays;

public class DivideStringEqualsParts {
	
	public static void divideString(String st)
	{
		int len = st.length();
		int n= 4;
		int noOfchar = len/n;
		
		String[] splitstr = new String[n];
		int temp = 0;
		if(len%n != 0)
		{
			System.out.println("cannot divide the string into  equal part");
		}
		else
		{
			for(int i =0; i<st.length(); i+=noOfchar)
			{
				splitstr[temp] = st.substring(i, i+noOfchar);
				temp++;
			}
		}
		System.out.println(Arrays.toString(splitstr));
	}
	public static void main(String[] args) {
		
		String st = "Programming";
		divideString(st);
		
	}

}
