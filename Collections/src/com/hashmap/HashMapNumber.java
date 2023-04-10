package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapNumber {

	public static String converWord(int n) {
		String word = null;
		switch (n) {
		case 1:
			word = "one";
			break;
		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		case 5:
			word = "five";
			break;
		}
		return word;
	}

	public static void OccuranceNumber(ArrayList<Integer> list) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int num : list) {
			String nword = converWord(num);
			int count = 1;
			if (map.containsKey(nword)) {
				count = map.get(nword);
				map.put(nword, count + 1);
			} else {
				map.put(nword, count);
			}
		}
		for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + " :" + en.getValue());
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(5);
		al.add(1);
		OccuranceNumber(al);
		
	}

}
