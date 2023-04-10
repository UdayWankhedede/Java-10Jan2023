package com.hierachy;

public class RacingBike 
{
	private float speed;
	private RacingBike()
	{
		super();
		System.out.println("inside RacingBike default constructor");
	}
	public RacingBike(int modelNo, String brand, float price,float speed) {
		super();
		this.speed=speed;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public String toString() {
		return super.toString()+"RacingBike [speed=" + speed + "]";
	}
	
}
