package com.arraylist;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) 
	{
		 ArrayList<String> aobj= new ArrayList<>();
	      
		 aobj.add("Uday");
		 aobj.add("Piyush");
		 aobj.add(null); // null allowed
		 aobj.add("Aditi");
		 aobj.add("Ashu");
		 aobj.add("Rutuja");// duplicate allowed
		 aobj.add(null); 
		
		 System.out.println(aobj);
		 
		 aobj.add(3,"adesh");

		 System.out.println("================================After Adding===========================================");
	 System.out.println(aobj);
		 
		 ArrayList <String> aobj2= new ArrayList<>();
		 aobj2.add("Uday");
		 aobj2.add("Pratik");
		 aobj2.add("Suyog");
		 System.out.println(aobj2);
	
		 System.out.println("================================After Adding===========================================");
		 aobj.addAll(3 ,aobj2);
		 
		 System.out.println(aobj);

		 aobj.retainAll(aobj2);
		 
		 System.out.println("================================After retain===========================================");
	
		 System.out.println(aobj2);
	     
		 
	}

}
