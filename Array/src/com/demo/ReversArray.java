package com.demo;

import java.util.Scanner;



public class ReversArray {
	
	public static void Reverse(int Arr[])
	{
		for(int i = Arr.length-1; i>=0;i-- )
		{
			System.out.println(Arr[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("ENtre nuumber the elements");
		int size = sobj.nextInt();
		int i = 0;
		int Arr[] = new int[size];

		System.out.println("ENtre the elements");
		for (i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}
		
		Reverse(Arr);
}
}
