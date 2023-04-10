package com.Array;

import java.util.Scanner;

//WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’,‘R’], so min character is ‘A’.

public class SmallestElementiInChar {
	
	public static void SmallestChar(char Arr[])
	{
		int iMin = Arr[0];
		for(int i =0; i<Arr.length; i++)
		{
			if(Arr[i]<iMin)
			{
				iMin = Arr[i];
			}
		}
		System.out.println(iMin);
	}
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = sobj.nextInt();
		char Arr[] = {'A','D','E','x','z','R'};
		
		
//		System.out.println("Entre the char element");
//			char Arr[] = sobj.next().toCharArray();
//			
//			for (int i = 0; i < Arr.length; i++) 
//			{
//		         System.out.println(Arr[i]);
//	}
		
		SmallestChar(Arr);
	}

}
