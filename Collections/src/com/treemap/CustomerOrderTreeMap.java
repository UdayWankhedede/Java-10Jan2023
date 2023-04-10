package com.treemap;

import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String[] args) {

    TreeMap<Customer, Order> cmap= new TreeMap<>();
    cmap.put(new Customer(101,"Shuruti",786544), new Order(5,"PenDrive",780f));
    cmap.put(new Customer(100,"Sagar",786541), new Order(2,"Laptop",78000f));
    cmap.put(new Customer(99,"Priya",796041), new Order(1,"Earphones",1200f));
    
    
    System.out.println(cmap);
    
    // compareTo calls containsKey
    
    
   /* 
    * for custom keys we need to override hashcode and equals
    HashMap<Customer, String> hm= new HashMap<>();
    hm.put(new Customer(101,"Shuruti",786544), "Pendrive");
    hm.put(new Customer(101,"Shuruti",786544), "Laptop");
    
    System.out.println(hm);
    */
    
    
    NavigableSet<Customer> ns= cmap.navigableKeySet();
    
    for(Customer c:ns)
    {
    	System.out.println("-----------------------------");
    	System.out.println(c);
    	System.out.println(cmap.get(c));
    	System.out.println("-----------------------------");
    }
    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    
   NavigableSet<Customer> nv= cmap.descendingKeySet();
    
    for(Customer c:nv)
    {
    	System.out.println("-----------------------------");
    	System.out.println(c);
    	System.out.println(cmap.get(c));
    	System.out.println("-----------------------------");
    }
		

	}

}
