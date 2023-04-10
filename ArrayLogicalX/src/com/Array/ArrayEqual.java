package com.Array;

import java.util.Scanner;

///test the equality of two arrays

public class ArrayEqual {

	public static boolean Equals(int Arr[], int Brr[]) {
		int j = 0;
		boolean flag = true;
		if (Arr.length == Brr.length) 
		{
			for (int i = 0; i < Arr.length; i++) 
			{
				if (Arr[i] != Brr[i]) {
					flag = false;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		int iSize1 = 0;
		int iSize2 = 0;
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

		boolean iRet = Equals(Arr, Brr);

		if (iRet == true) {
			System.out.println("Same");
		} else
			System.out.println("not Same");
	}

}
