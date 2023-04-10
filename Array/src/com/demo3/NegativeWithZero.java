package com.demo3;


import java.util.Scanner;

public class NegativeWithZero {	

	static Scanner sc= new Scanner (System.in);
	
	public static void enterArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= sc.nextInt();
		}
		
	}
		
	public static void replaceNegative(int ar[])
	{
		
       for(int i=0;i<ar.length;i++)
       {
    	   if(ar[i]<0)
    		   ar[i]=0;
       
       }
     
   	}

	public static void main(String[] args) {

		System.out.println("Enter the size:");
		int size= sc.nextInt();
		
		int myarray[]= new int[size];
		
		System.out.println("Enter array elements:");
	    enterArray(myarray);	
	    
	    System.out.println("--------------------------");
	    System.out.println("New Array is:");
	    
	     replaceNegative(myarray);  
	          
	      for(int i:myarray)
	       {
	    	   System.out.print(i+"  ");
	       }
			
	   
	            
        	 

	}

}
