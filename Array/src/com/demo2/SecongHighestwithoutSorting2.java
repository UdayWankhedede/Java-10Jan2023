package com.demo2;


public class SecongHighestwithoutSorting2 {
	
	public static void secondHighest(int arr[])
	{
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest)
				{
				shighest=highest;
				 highest=arr[i];
				}
			if((arr[i]<highest)&&(arr[i]>shighest))
			{
				shighest=arr[i];
			}
			  
			
		}
		
		System.out.println("Second Highest :"+shighest);
		
	}
	
	public static void main(String args[])
	{
		int myarr[]= {4,6,3,5,7,2};
		
		secondHighest(myarr);
	}

}
