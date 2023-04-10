package com.demo;

public class String1 {

	public static void main(String[] args) {

		// string immutable
		String s1 = "Java";

		System.out.println(s1);
		s1.concat(" Lang");
		System.out.println(s1);

		String s2 = "Welcome";
		System.out.println(s2);
		s2 = s2.concat(" home");
		System.out.println(s2);

		char ch[] = { 'j', 'a', 'v', 'a' };

		String s = new String(ch);

	}

}
