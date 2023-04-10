package com.demo2;

import java.util.Scanner;

public class FirstOccurance
{
	public static void FirstSearch(int Arr[],int iNo)
	{
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == iNo)
			{
				System.out.println("Element is present");
			}
			else
				System.out.println("Element is not present");
		}
	}
	public static void main(String args[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("entre the number of element");
		int iSize = sobj.nextInt();
		int Arr[] = new int[iSize];
		
		System.out.println("entre the  element");
		
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}
		System.out.println("entre the  element to search");
		int iNo = sobj.nextInt();		
		
		FirstSearch(Arr,iNo);
	}
}