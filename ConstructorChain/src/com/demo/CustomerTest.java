package com.demo;

import java.util.Scanner;

public class CustomerTest 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		Customer c1 = new Customer(); // default constructor call 1 customer
		Customer c2 = new Customer(101, "uday", "123424"); //1 Parameterized constructor call
		Customer c3 = new Customer(102, "Piyush", "254684","TV",100000.50f,"FullPaid");//2 Parameterized constructor call
		
		System.out.println("---------------------For Customer 1----------------------");
		
		System.out.println("Entre th id");
		c1.setCid(sobj.nextInt());
		
		System.out.println("Entre the name");
		c1.setName(sobj.next());
		
		 System.out.println("enter the phone number:");
	     c1.setPhoneNumber(sobj.next());
	     
	     System.out.println("Do you want to purchase item(1-Yes / 0-No) :");
	     int Choice = sobj.nextInt();
	     
	     if(Choice == 1)
	     {
	    	 System.out.println("Enter the item name:");
	    	  c1.setItemname(sobj.next());
	    	  
	    	  System.out.println("Enter the price:");
	    	  c1.setPrice(sobj.nextFloat());
	    	  
	    	  System.out.println("Enter the payment status:");
	    	  c1.setStatus(sobj.next());
	     }
		
	     System.out.println("---------------------For Customer 2----------------------");
		
	     System.out.println(c2);
		 System.out.println("Do you want to purchase item(1-Yes / 0-No) :");
		 Choice = sobj.nextInt();
		     
		 if(Choice == 1)
		     {
		    	 System.out.println("Enter the item name:");
		    	  c2.setItemname(sobj.next());
		    	  
		    	  System.out.println("Enter the price:");
		    	  c2.setPrice(sobj.nextFloat());
		    	  
		    	  System.out.println("Enter the payment status:");
		    	  c2.setStatus(sobj.next());
		     }

	      System.out.println("----------------------------");
	      
	      System.out.println(c1);
	      System.out.println(c2);
	      System.out.println(c3);
	      
	}

}
