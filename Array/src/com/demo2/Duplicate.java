package com.demo2;

import java.util.Scanner;

public class Duplicate {
	
	public static void Duplicate(int Arr[])
	{
		int iCnt=0;
		int count = 0;
		for(int i = 0; i < Arr.length; i++)
		{
//			iCnt = 1;
//			if(Arr[i] == '\0')
//				continue;
			for(int j = 0; j < Arr.length; j++)
			{
				if(Arr[i]==Arr[j])
				{
					System.out.println(Arr[j]);
					iCnt++;
					Arr[j] = '\0';
				}
				
			}
			System.out.println(iCnt);
		}
		}
	
	
	public static void main(String Arg[])
	{
		Scanner sobj  = new Scanner(System.in);
		System.out.println("entre the number of element 1st array");
		int iSize1 = sobj.nextInt();
		
		int Arr[] = new int[iSize1];
		System.out.println("entre the  element");
		for(int i = 0; i <Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
//		System.out.println("entre the number of element 2nd array");
//		int iSize2 = sobj.nextInt();
//		int Brr[] = new int[iSize2];
//		System.out.println("entre the  element");
//		for(int i = 0; i <Arr.length; i++)
//		{
//			Brr[i] = sobj.nextInt();
//		}
		
		Duplicate(Arr);
		
	}

}
