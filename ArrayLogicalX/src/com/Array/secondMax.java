package com.Array;

import java.util.Scanner;

class ArrayXX
{
	private int Arr[];
	public ArrayXX(int iSize)
	{
		Arr = new int[iSize];
	}
	
	public void Accepy()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Emtre the elements");
		for(int i =0; i <Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}
	
	public void SecondMax() //{10,20,54,21,}
	{
		int temp = Arr[0];
		for(int i =0; i<Arr.length; i++)
		{
			for(int j = i +1; j<Arr.length; j++)
			{
				if(Arr[i] > Arr[j])
				{
					temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
		System.out.println(Arr[Arr.length-2]);
	}
}
	
public class secondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sobj = new Scanner(System.in);
		int iSize = 0;
		System.out.println("Entre the size of Array");
		iSize = sobj.nextInt();
		
		ArrayXX obj = new ArrayXX(iSize);
		
		obj.Accepy();
		obj.SecondMax();
	}

}
