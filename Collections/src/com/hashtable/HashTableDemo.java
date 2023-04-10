package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> hs = new Hashtable<>();

		hs.put(1, "Rupali");
		hs.put(2, "Gurav");
		hs.put(3, "sairaj");
		hs.put(4, "sagar");
		
		Enumeration <Integer>en = hs.keys();
		
		while(en.hasMoreElements())
		{
			int key = en.nextElement();
			System.out.println(key + " " +hs.get(key));
		}
	}
}
