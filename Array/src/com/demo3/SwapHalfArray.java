package com.demo3;



public class SwapHalfArray {
	
	public static void halfSwap(int arr[])
	{
		int j=(arr.length/2);
		int temp;
		
		for(int i=0;i<arr.length/2;i++)
		{ 
			temp= arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			j++;
		}
		
		
	}
	
	public static void halfSwap2(int arr[])
	{
		
		int temp;
		
		for(int i=0,j=(arr.length/2);i<arr.length/2;i++,j++)
		{ 
			temp= arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			
		}
		
		
	}
	
	public static void printArray(int ar[])
	{
		 for(int i:ar)
			{
				System.out.print(i+"  ");
			}	
	}

	public static void main(String[] args) {

      int arr[]= {2,4,9,0,3,1,2};
      
      System.out.println("Before:");
      
      printArray(arr);
      
      halfSwap(arr);
     
      System.out.println();
      System.out.println("After:");
            
     printArray(arr);
		
		
	}

}

