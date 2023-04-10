package com.demo;

import java.util.Scanner;

public class MAximumNumber {

	public static void CheckMax(int Arr[]) {
		int iMax = Arr[0];
		for (int i = 0; i < Arr.length; i++) {
			if (iMax < Arr[i]) {
				iMax = Arr[i];
			}
		}
		System.out.println(iMax);
	}

	public static void CheckMin(int Arr[]) {
		int iMin = Arr[0];
		for (int i = 0; i < Arr.length; i++) {
			if (iMin > Arr[i]) {
				iMin = Arr[i];
			}
		}
		System.out.println(iMin);
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

		CheckMax(Arr);
		CheckMin(Arr);

	}

}
