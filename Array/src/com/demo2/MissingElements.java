package com.demo2;

import java.util.Scanner;

public class MissingElements {
	public static void Missing(int Arr[])
	{
		int iValue = Arr[0];
		for(int i = 0;i <Arr.length; i++ )
		{
			if(Arr[i]+1 != Arr[i+1])
			{
				System.out.println((Arr[i]+1));
			}
		}
	}

	public static void main(String[] args) {
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
		Missing(Arr);
		
	}

}
