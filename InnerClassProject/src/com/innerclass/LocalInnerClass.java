package com.innerclass;


class Outer
{
	private int data = 10;
	void display()
	{
		class LocalInner
		{
			private int value = 90;
			static void show()
			{
			System.out.println(data);	
			}
			
			void show1()
			{
				System.out.println(value);
			}
		}
	}
	LocalInner L1 = new LocalInner();
	
}
public class LocalInnerClass {

	public static void main(String[] args) 
	{
		
	}

}
