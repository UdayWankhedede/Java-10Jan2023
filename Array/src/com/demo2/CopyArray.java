package com.demo2;


import java.util.Arrays;

public class CopyArray {

		
	public static void main(String[] args) {

      int arr[]={6,5,4,1,10};
      System.out.println("Original:"+Arrays.toString(arr));
      /*
      int carr[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
	      {
	    	  carr[i]= arr[i];
	      }
		
		System.out.println("Copy:"+Arrays.toString(carr));
		
		arr[2]=5;
		 System.out.println("Original:"+Arrays.toString(arr));
		System.out.println("Copy:"+Arrays.toString(carr));
      */
      
    ////////////////////////////////////////
		
		/*int carr1[]= Arrays.copyOf(arr, arr.length);
		System.out.println("Copy:"+Arrays.toString(carr1));
		
		arr[2]=5;
		
		 System.out.println("Original:"+Arrays.toString(arr));
	     System.out.println("Copy:"+Arrays.toString(carr1));*/
      
        int carr2[]= arr.clone();
        System.out.println("Copy:"+Arrays.toString(carr2));
		
		arr[2]=5;
		
		 System.out.println("Original:"+Arrays.toString(arr));
	     System.out.println("Copy:"+Arrays.toString(carr2));
      

	}

}
