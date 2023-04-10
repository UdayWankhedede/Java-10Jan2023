package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOccurance {

	public static void occuranceMap(ArrayList<String> list) {
		HashMap<String, Integer> map = new HashMap<>();

		int iCount;
		for (String s : list) {
			iCount = 1;
			if (map.containsKey(s)) {
				iCount = map.get(s);
				map.put(s, iCount + 1);
			} else
				map.put(s, iCount);
		}
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey()+ " :" + en.getValue());
		}
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Suyog");
		al.add("Mamta");
		al.add("sagar");
		al.add("Mamta");
		al.add("aditi");
		al.add("piyush");
		al.add("aditi");

		occuranceMap(al);

	}

}
