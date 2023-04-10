package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayListDemo2 {

	public static void main(String[] args) 
	{
		List <Integer>list1 = new ArrayList<Integer>();
		
		list1.add(50);
		list1.add(25);
		list1.add(21);
		list1.add(101);
		
		
		for(int i =0;i <list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data = list1.get(i)+5;
			list1.set(i,data);
		}
		System.out.println("=============");
		for(Integer l :list1)
		{
			System.out.println(l);
		}
	}

}
