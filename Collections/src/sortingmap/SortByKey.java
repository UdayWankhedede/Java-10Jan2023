package sortingmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SortByKey {
	
	public static void sortKey(HashMap<Integer,String> map)
	{
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		for(Integer i:list)
		{
			System.out.println(i+" "+map.get(i));
		}
		
		LinkedHashMap<Integer, String> lhm= new LinkedHashMap<>();
		for(Integer i:list)
		{
			lhm.put(i, map.get(i));
		}
		
		System.out.println(lhm);
	}

	public static void main(String[] args) {

		HashMap<Integer,String> map1= new HashMap<>();
		map1.put(1, "Java");
		map1.put(7, "C");
		map1.put(6, "Python");
		map1.put(4, "Angular");
		map1.put(3, "SpringBoot");
		map1.put(2, "HTML");
		
		System.out.println(map1);
		
		sortKey(map1);

	}

}
