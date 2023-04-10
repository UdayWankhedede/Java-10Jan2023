package com.Array;

import java.util.Scanner;

//WAP to arrange the elements of an given array of integers where all negative integers appear before all the positive integers
//1,2,-3,4,-5,18,-6
public class ArrangeElement {

	public static void ArrangeAccending(int Arr[]) 
	{
		int iValue = Arr.length;
		int iMin = Arr[0]; 
		for (int i = 0; i < Arr.length; i++)
		{
			for (int j = i+1; j < Arr.length; j++) 
			{
				if(Arr[i] > Arr[j]) //here we compare the array element with i and j
				{
					iMin = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = iMin;
				}
			}
			System.out.println(Arr[i]);
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

		ArrangeAccending(Arr);
	}

}
