package com.Array;

import java.util.Scanner;

public class ReverseArray {

//	public static void Reverse(int Arr[])
//	{
//		for(int i = Arr.length-1; i >=0; i--)
//		{
//			System.out.print(Arr[i]+" ");
//		}
//	}
	public static void ReverseNewArray(int Arr[])
	{
		
		int iSize = Arr.length;
		int j = iSize;
		int Brr[] = new int[iSize];
		for(int i = 0; i <iSize;i++)
		{
			Brr[j - 1] = Arr[i];
			j = j -1;
		}
		for(int K = 0; K < iSize; K++)
		{
			System.out.println(Brr[K]);
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
	
//		Reverse(Arr);
		ReverseNewArray(Arr);
	}

}
