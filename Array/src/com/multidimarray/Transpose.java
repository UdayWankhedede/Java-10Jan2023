package com.multidimarray;

public class Transpose {
	
	public static void calTranspose(int arr[][])
	{
		int rows,cols;
		rows= arr.length;
		System.out.println(rows);
		cols= arr[0].length;
		System.out.println(cols);
		
		int tarr[][]= new int[cols][rows];
		
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				tarr[i][j]=arr[j][i];
			}
		}
		System.out.println("Transpose is:");
		
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{

               System.out.print(tarr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

       int myarr[][]= {{1,2,3},
    		           {6,0,7}
                       };
       calTranspose(myarr);
       

	}

}
