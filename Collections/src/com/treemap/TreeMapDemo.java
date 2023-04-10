package com.treemap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map1 = new TreeMap<>();
		
		map1.put(7, "C");
		map1.put(6, "Python");
		map1.put(4, "Angular");
		map1.put(1, ".Net");
		map1.put(3, "C++");
		map1.put(2, "Dango");
		map1.put(9, "Aws");
		
		
		System.out.println("Fistr KEy -> " + map1.firstKey());
		
	}

}
