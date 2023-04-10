package com.demo3;



import java.util.Scanner;

public class CountOcuurence {	

	static Scanner sc= new Scanner (System.in);
	
	public static void enterArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= sc.nextInt();
		}
		
	}
		
	
	public static void searchArrayPos(int ar[], int value)
	{
		boolean status= false;
	    int count =0;
       for(int i=0;i<ar.length;i++)
       {
    	   if(ar[i]==value)
    	   {
    		   status=true;
    		   count++;
       	   }
       }
		
       if(!status)
       {
    	   System.out.println("Element is  not present");
       }
       else
       {
    	   System.out.println("Element is present:"+count+" times");
       } 
	}

	public static void main(String[] args) {

		System.out.println("Enter the size:");
		int size= sc.nextInt();
		
		int myarray[]= new int[size];
		
		System.out.println("Enter array elements:");
	    enterArray(myarray);	
	    
	    System.out.println("--------------------------");
	    System.out.println("Enter the element to be searched:");
	    
	    int ele= sc.nextInt();
	    
	   searchArrayPos(myarray, ele);
	            
        	 

	}

}
