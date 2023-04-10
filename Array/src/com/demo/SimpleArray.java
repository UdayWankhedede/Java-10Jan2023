package com.demo;

public class SimpleArray {

	public static void main(String[] args) {

      int arr[];
      arr= new int[10];
      
      int arr1[]= new int[20];
      
      arr[0]=90;
      arr[1]=89;
      arr[2]=67;
      //arr[10]=90;
      
      System.out.println(arr);
      
      for(int i=0;i<10;i++)
      {
    	  System.out.println(arr[i]);
      }

	}

}
