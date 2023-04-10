 package com.demo2;

import java.util.Scanner;

public class Alternate {

	public static void  AlernateSeries(int Arr[])
	{
		for(int i = 0; i < Arr.length; i++)
		{
			if(i %2 == 0)
			{
				System.out.println(Arr[i]);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre number of elements Array");
		int size = sobj.nextInt();
		int i = 0;
		int Arr[] = new int[size];

		System.out.println("Entre the elements in Array");
		for (i = 0; i < Arr.length; i++) 
		{
			Arr[i] = sobj.nextInt();
		}
	
		AlernateSeries(Arr);
		
	}

}
