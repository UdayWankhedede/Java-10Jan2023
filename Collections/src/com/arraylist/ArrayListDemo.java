package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		List list1 = new ArrayList();
		
		list1.add("Uday");
		list1.add(25);
		list1.add(60f);
		list1.add('U');
		
		
		for(int i =0;i <list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
	}

}
