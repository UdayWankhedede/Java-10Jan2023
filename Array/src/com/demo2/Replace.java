package com.demo2;

import java.util.Scanner;

public class Replace {

	public static void ReplaceZero(int Arr[]) {
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] < 0) {
				Arr[i] = 0;
			}
			System.out.print(Arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("entre the number of element");
		int iSize = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("entre the  element");
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = sobj.nextInt();
		}

		ReplaceZero(Arr);
	}
}
