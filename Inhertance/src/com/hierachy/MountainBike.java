package com.hierachy;

public class MountainBike extends Bike {
	private int gear;
	private int seatHeight;

	public MountainBike() {
		super();
		System.out.println("Inside MountainBike defaukt constructor");
	}

	public MountainBike(int modelNo, String brand, float price, int gear, int seatHeight) {
		super(modelNo, brand, price);
		this.gear = gear;
		this.seatHeight = seatHeight;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public String toString() {
		return super.toString() + "MountainBike [gear=" + gear + ", seatHeight=" + seatHeight + "]";
	}

}
