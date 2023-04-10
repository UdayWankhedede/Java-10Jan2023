package sortingmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByValue {
	
	public static void sortValue(HashMap<Integer,String> map)
	{
		ArrayList<String> al= new ArrayList<>(map.values());
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
		
		int k;
		for(String s:al)
		{
			for(Map.Entry<Integer,String> en:map.entrySet())
			{
				if(en.getValue().equals(s))
				{
				    k= en.getKey();
				    if(!lhm.containsKey(k))
				    {
				    	lhm.put(k, s);
				    }
				}
			}
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
		
		sortValue(map1);

	}

}
