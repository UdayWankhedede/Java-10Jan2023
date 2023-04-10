package com.innerclass;

interface Doable {
	public void doIt();

}

class Car {
	public void drive() {
		System.out.println("i am driving");
	}
}

abstract class Cake {
	void doBaking() {
		System.out.println("I am Baking");
	}
}

public class AnnonymousInnerClass {
	public static void main(String[] args) {
//AnonymousInnerClass$ implements Doable
		Doable d = new Doable() {
			public void doIt() {
				System.out.println("I am doing");
			}
		};
		d.doIt();
		Car c = new Car()
				{
					public void drive()
					{
						System.out.println("i am driving");
					}
				};
				c.drive();
	}

}
