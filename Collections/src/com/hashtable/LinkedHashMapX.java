package com.hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapX {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Double> lmap = new LinkedHashMap<>();
	
		lmap.put("Ruplai", 78.5);
		lmap.put("Aditi", 81.5);
		lmap.put("vivek", 88.5);
		lmap.put("uday", 68.5);
		
		for(Map.Entry<String, Double>en : lmap.entrySet())
		{
			System.out.println(en.getKey()+ " "+en.getValue());
		}
		
		Set<String> names = lmap.keySet();
		
	}

}
