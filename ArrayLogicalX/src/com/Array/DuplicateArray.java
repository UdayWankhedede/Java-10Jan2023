package com.Array;

import java.util.Scanner;

public class DuplicateArray {
	public static void Duplicate(int Arr[])
	{
		for(int i =0; i <Arr.length; i++)
		{
			for(int j = i +1; j <Arr.length; j++)
			{
				if(Arr[i] == Arr[j])
				{
					System.out.println(Arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Entre the size of Array");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("Entre the element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}
		
		Duplicate(Arr);
	}

}
