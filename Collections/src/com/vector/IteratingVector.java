package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {
	public static void main(String[] args) {
		Vector<String> names = new Vector<>();
		
		names.addElement("Vaishnavi");
		names.add("Rohan");
		names.add("Uday");
		names.add("Scout");
		names.add("ADiti");
		names.add("Piyuh");
		
		
		System.out.println(names);
		
		System.out.println("=====================");
		
		Iterator<String> itr = names.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		System.out.println("=====================");
//		
//		ListIterator<String>litr = (names.listIterator()(names.size()));
		
		Enumeration<String> en = names.elements();
		
		while(en.hasMoreElements())
		{
			String st = en.nextElement();
			if(st.equals("Rohan"))
			{
				names.remove("Rohan");
			}
		}
		System.out.println(names);
	}

}
