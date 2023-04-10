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
			
			public void displayBill()
			{
				System.out.println("------------------------------------------");
				System.out.println("Shopping Mall : " +mallName);
				System.out.println("Toatl bill :"+bill);
			}
		}
		Car c1 = new Cart();
		c1.addBill("Laptop",34000.5f);
		c1.addBill("Charger",4000.5f);
		c1.addBill("Pendrive",400.5f);
		c1.displayBill();
	}

	
}
public class LocalInnerClass2 {

	public static void main(String[] args) 
	{
		
	}

}
