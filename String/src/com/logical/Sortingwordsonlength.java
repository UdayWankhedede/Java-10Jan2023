package com.logical;

import java.util.Arrays;

public class Sortingwordsonlength {

	public static void sort(String str[]) {
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() == str[j].length()) {
					if ((str[i].compareTo(str[j])) > 1) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				} else {
					if (str[i].length() > str[j].length()) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {

		String str[] = { "Java", "C", "Python", "C++", "Go" };
		sort(str);
	}

}
