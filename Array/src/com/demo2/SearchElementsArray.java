package com.demo2;

import java.util.Scanner;

public class SearchElementsArray
{
	public static void Search(int Arr[], int iNo)
	{
		for(int i = 0; i < Arr.length; i++)
		{
			if(Arr[i]==iNo)
			{
				System.out.println("index no" +i +" " + " " +Arr[i]);
			}
		}
	}	
		public static void SearchAll(int Arr[])
		{
			for(int i = 0; i < Arr.length; i++)
			{
					System.out.println("index no" +i +" " + " " +Arr[i]);
			}
	}
	public static void main(String args[])
	{
		Scanner sobj  = new Scanner(System.in);
		System.out.println("entre the number of element");
		int iSize = sobj.nextInt();
		
		int Arr[] = new int[iSize];
		System.out.println("entre the  element");
		for(int i = 0; i <Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		System.out.println("entre the  element to search");
		int iNo = sobj.nextInt();		
		
		//Search(Arr,iNo);
		SearchAll(Arr);
	}
}