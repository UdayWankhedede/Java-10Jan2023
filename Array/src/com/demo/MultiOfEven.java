package com.demo;

import java.util.Scanner;

public class MultiOfEven 
{
	public static void main (String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("ENtre nuumber the elements");
		int size = sobj.nextInt();
		int sum = 0;
		int i =0;
		int Arr[] = new int[size];
		
		for( i =0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
	
		}
		
		for( i =0; i < Arr.length; i++)
		{
			if((Arr[i]%2) == 0)
			{
				sum = sum + Arr[i];
			}
		}
		System.out.println("Sum of evev :" +sum);
	}
}
