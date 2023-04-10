package com.Array;

import java.util.Scanner;
//WAP to check if an array of integers contains two specified elements 65 and 77.

public class CheckNumbers {
	
	public static boolean Search(int Arr[], int iNo1, int iNo2)
	{
		boolean flag = false;
		for(int i =0; i <Arr.length; i++)
		{
			if(Arr[i] == iNo1 || Arr[i] == iNo2)
			{
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Entre the size of Array");
		iSize = sobj.nextInt();
		
		System.out.println("Entre 1st number");
		int iNo1 = sobj.nextInt();
		System.out.println("Entre 2nd number");
		int iNo2 = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("Entre the element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}

		boolean iRet =Search(Arr,iNo1,iNo2);
		
		if(iRet == true)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
}
