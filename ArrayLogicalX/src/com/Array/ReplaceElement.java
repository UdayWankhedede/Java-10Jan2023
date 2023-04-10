package com.Array;
import java.util.Scanner;
//WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34]

public class ReplaceElement {
	
	public static void Replace(int Arr[], int iNo)
	{
		for(int i = 0; i <Arr.length; i++)
		{
			if(Arr[i] == 0)
			{
				Arr[i] = iNo;
			}
		}
		for(int i = 0; i <Arr.length; i++)
		{
			System.out.print(" " +Arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		int iNo =0;
		System.out.println("Entre the size of Array");
		iSize = sobj.nextInt();
		System.out.println("Entre the number with you want to replace");
		iNo = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("Entre the element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}
		
		Replace(Arr, iNo);
	}

}
