package com.Array;

import java.util.Scanner;

public class ArrangeEvenOdd {
	public static void ArrangeEvenOdd(int[] arr)
	{
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] %2 ==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
	
			Scanner sobj = new Scanner(System.in);
			int iSize = 0;
			System.out.println("Entre the size of Array");
			iSize = sobj.nextInt();

			int Arr[] = new int[iSize];
			System.out.println("Entre the element");
			for (int i = 0; i < Arr.length; i++) {
				Arr[i] = sobj.nextInt();
			}

			ArrangeEvenOdd(Arr);
	}

}
