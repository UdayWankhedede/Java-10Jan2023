package com.Array;

import java.util.Scanner;

public class DuplicateTwoArray {
	
	public static void Duplicate(int Arr[], int Brr[])
	{
		for(int i =0; i < Arr.length; i++)
		{
			for(int j = 0; j<Brr.length; j++)
			{
				if(Arr[i] == Brr[j])
				{
					System.out.println(Arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		int iSize1 = 0;
		int iSize2 =0;
		System.out.println("Entre the size of Array");
		iSize1 = sobj.nextInt();
		iSize2 = sobj.nextInt();

		int Arr[] = new int[iSize1];
		System.out.println("Entre the element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}
		int Brr[] = new int[iSize2];
		System.out.println("Entre the element");
		for (int i = 0; i < Brr.length; i++) {
			Brr[i] = sobj.nextInt();
		}
		
		Duplicate(Arr, Brr);
	}

}
