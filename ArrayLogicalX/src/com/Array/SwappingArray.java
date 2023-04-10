package com.Array;

import java.util.Scanner;

public class SwappingArray {
	
	public static void Swapping(int Arr[])
	{
		int temp = 0;
		int j = Arr.length/2;
		for(int i =0; i <Arr.length/2; i++)
		{
			temp = Arr[i];
			Arr[i] = Arr[j];
			Arr[j] = temp;
			j++;
			
		}
		for(int i = 0; i <Arr.length; i++)
		{
		System.out.println(Arr[i]);
	}
}
	
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		int iSize1 = 0;
		System.out.println("Entre the size of Array");
		iSize1 = sobj.nextInt();

		int Arr[] = new int[iSize1];
		System.out.println("Entre the element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}
		
		Swapping(Arr);
	}
}
