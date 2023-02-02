package com.demo;

public class polydemo 
{
	 static float Area(float fNo)
	{
		float fArea = (float) (3.14 * fNo * fNo);
		return fArea;
	}
	 static int Area (int iNo)
	{
		int Area = iNo * iNo;
		return Area;
	}
	 static int Area(int iLength, int iBreadth)
	{
		int Area  = iLength * iBreadth;
		return Area;
	}
	static double Area(double Base, double height)
	{
		double Area = 0.5*Base*height;
		return Area;
	}
	public static void main(String args[])
	{
//		polydemo.Area(6);
//		polydemo.Area(5.6f);
//		polydemo.Area(7, 9.7f);
//		polydemo.Area(6.7f,7);
		
		System.out.println(polydemo.Area(6));
		System.out.println(polydemo.Area(5.6f));
		System.out.println(polydemo.Area(7, 9.7f));
		System.out.println(polydemo.Area(6.7f,7));
	}
}
