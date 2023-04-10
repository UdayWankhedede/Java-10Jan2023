package com.logical;

import java.util.Scanner;

public class Duplicate {

	public static void DuplicateWord(String str) {
		String[] splitstr = str.split(" ");
		int iCnt = 0;
		{
			for (int i = 0; i < splitstr.length; i++) {
				iCnt = 1;

				for (int j = i + 1; j < splitstr.length; j++) {
					if (splitstr[i].equals(splitstr[j])) {
						iCnt++;

						splitstr[j] = "0";
					}
				}
				if (iCnt > 1 && splitstr[i] != "0") {
					System.out.println(splitstr[i] +iCnt);

				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.println("Entre the string");
		String str = sobj.nextLine();

		DuplicateWord(str);

	}

}
