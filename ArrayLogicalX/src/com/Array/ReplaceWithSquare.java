package com.Array;

import java.util.Scanner;

//WAP to replace all negative value with its immediate left elements square. Means
//arr[] = [12, 3, -19, 29, 5, -61, 44, 7, -9]
//Output array will be [12, 3, 9, 29, 5, 25, 44, 7, 49].

public class ReplaceWithSquare {
	public static void Replace(int Arr[])
	{
		for(int i =0; i <Arr.length; i++)
		{
			if(Arr[i] < 0)
			{
				Arr[i] = Arr[i-1]*Arr[i-1];
			}
		}
		for(int i =0; i <Arr.length; i++)
		{
			System.out.print(Arr[i] + " ");
		}
	}

	public static void main(String[] args) 
	{	
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Entre the size of Array");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("Entre the element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}

		Replace(Arr);
	}

}
