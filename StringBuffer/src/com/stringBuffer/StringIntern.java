package com.stringBuffer;

public class StringIntern {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = s1.intern();
		
		System.out.println(s1 == s2);
	}
}
