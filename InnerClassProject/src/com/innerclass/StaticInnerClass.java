package com.innerclass;

class OuterClass
{
	static int value1 = 90;
	int value2 = 67;
	void display()
	{
		System.out.println(value1+ " "+value2);
	}
	static class InnerClass
	{
		String msg1= "Hello";
		static String msg2 ="welcome";
		
		void show()
		{
			System.out.println(value1);
//			System.out.println(value2); we cannot access non static in static class

			//dispaly();
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
