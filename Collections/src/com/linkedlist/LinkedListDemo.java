package com.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList <String>slist = new LinkedList<>();
		
		slist.add("Java");
		slist.add("Python");
		slist.add("Html");
		System.out.println(slist);
		
		slist.addFirst("C++"); //return void
		System.out.println(slist);
	}

}
