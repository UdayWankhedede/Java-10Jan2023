package com.Array;

import java.util.Scanner;

public class ArrayTable {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Entre the number for table");
		iSize = sobj.nextInt();

		int Arr[] = new int[10];
		Arr[0] = 1;
		for (int i = 0; i < Arr.length; i++) 
		{
			Arr[i] = iSize * i;
		}
		System.out.println("Array table");
		for(int i =0; i <Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}

	}

}
