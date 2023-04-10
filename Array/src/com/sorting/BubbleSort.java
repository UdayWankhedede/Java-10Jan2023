package com.sorting;


import java.util.Arrays;

public class BubbleSort {
	
	public static void sortArray(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])// ascending  <: descending
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {

      int myarr[]= {2,4,5,1,7,6};
      
      System.out.println("Before Sorting:");
      
      System.out.println(Arrays.toString(myarr));
      
      sortArray(myarr);
      
      System.out.println("After Sorting:");
      
      System.out.println(Arrays.toString(myarr));
      
      

	}

}
