package com.demo;

public class Rectangle 
{
	int length;
	int breadth;
	
	void entreValues(int l, int b)
	{
		length = l;
		breadth = b;
	}
	float displayArea()
	{
		float area = length*breadth;
		return area;
	}
	float displayPerimeter()
	{
		float Perimeter = 2*(length+breadth);
		return Perimeter;
	}
}
