package com.Array;

import java.util.Scanner;

class Array
{
	private int Arr[];	//Characterstic
	
	public Array(int iSize)
	{
		Arr = new int[iSize];
	}
	
	public void Accep()
	{
		 int iCnt = 0;
		 Scanner sobj = new Scanner(System.in);
		 System.out.println("Entre the value :");
		for(int i =0; i <Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}
	
}
public class ArrayX {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Entre the size of Array");
		iSize = sobj.nextInt();
		
		Array obj = new Array(iSize);
		
		
	}

}
