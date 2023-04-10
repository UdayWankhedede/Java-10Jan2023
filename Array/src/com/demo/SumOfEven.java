package com.demo;

import java.util.Scanner;

public class SumOfEven 
{
	
	public static void Multiply(int Arr[])
	{
		int Multi = 1;
	for( int i =0; i < Arr.length; i++)
	{
		if((Arr[i]%2) == 0)
		{
			Multi = Multi * Arr[i];
		}
	}
	System.out.println("Sum of evev :" +Multi);
	}
	
	public static void main (String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("ENtre nuumber the elements");
		int size = sobj.nextInt();
		int i =0;
		int Arr[] = new int[size];
		
		for( i =0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		Multiply(Arr);

		
	}
}
