package com.demo;

class Vehicle
{
	protected int speed;
	
	Vehicle ChangeSpeed()
	{
		speed = speed+10;
		return this;
	}
}
class Car extends Vehicle
{
	Car ChangeSpeed()
	{
		speed = speed+50;
		return this;
	}
}
public class Example2 {
	public static void main(String args [])
	{
		Car c1 = new Car();
		c1.ChangeSpeed();
	}

}
