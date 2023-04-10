package com.Array;
import java.util.Scanner;

//calculate average of all elements in an Array except max and min element

public class Average {
	 
	public static void AverageOfElement(int Arr[])//without max and min element
	{
		int iSum =0;
		int iMax = Arr[0];
		int iMin = Arr[0];
		int iValue = (Arr.length) -2;
		for(int  i = 0; i <Arr.length; i++)
		{
			if(Arr[i] >iMax)
			{
				iMax = Arr[i];
			}
			if(Arr[i] < iMin)
			{
				iMin = Arr[i];
			}
			if(Arr[i] != iMax|| Arr[i] != iMin)
			{
				iSum = iSum + Arr[i];
				System.out.println(iSum);
			}
		}
		System.out.println(iSum/iValue);
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
		
		AverageOfElement(Arr);
	}

}
