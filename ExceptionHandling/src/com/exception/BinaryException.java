package com.exception;

import java.util.Scanner;

public class BinaryException {

	public static void main(String[] args) 
	{
		Scanner sobj = new  Scanner(System.in);
		int iNo = sobj.nextInt();
		int remainder = 0;
		int Quotient = 0;
		while (iNo != 0)
		{
//			remainder = iNo % 2;
//		
//			Quotient = iNo /2;
			int r = iNo % 10;
					if((r != 1)&&(r!=0));
					{
						throws new BinaryException("Digit shpuld be 1 or 0");
					}
			
			
			
		}
		
		
	}

}
