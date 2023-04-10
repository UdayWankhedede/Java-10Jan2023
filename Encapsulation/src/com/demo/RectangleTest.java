package com.demo;

public class RectangleTest {

	public static void main(String[] args) 
	{
		Rectangle robj = new Rectangle();
		robj.entreValues(2, 8);
		System.out.println(robj.displayArea());
		System.out.println(robj.displayPerimeter());
	}

}
