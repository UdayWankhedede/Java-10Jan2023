package com.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 
{
	public static void main(String[] args) {
		HashMap<Integer , String> map1 = new HashMap<>();
		map1.put(1, "Java");
		map1.put(2, "C");
		map1.put(5, "Java");
		map1.put(3, "Python");
		map1.put(4, "Angular");
		
		
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
	
		Iterator<Map.Entry<Integer,String>> itr = entrySet.iterator();
	
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry = itr.next();
			
			if(entry.getValue().equals("Java"))
			{
				entry.setValue("Core Java");
				//entry.put(entry.getKey(),"Core Java");
			}
			System.out.println(entry.getKey()+" " + entry.getValue());
		}
	}
}
