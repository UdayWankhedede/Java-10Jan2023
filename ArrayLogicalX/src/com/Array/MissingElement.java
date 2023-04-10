package com.Array;

import java.util.Scanner;

public class MissingElement {
	public static void Duplicate(int Arr[])
	{
		int iCnt = 0;
		//here we start the array with first element number and travel to length -1
		for(int i =Arr[0]; i <Arr.length-1; i++)
		{
			if(Arr[iCnt] == i)
			{
				iCnt++;
			}
			else
			{
				System.out.println(" "+i);
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
