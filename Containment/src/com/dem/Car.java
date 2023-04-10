package com.dem;

public class Car {
	private String carNo;
	private String carName;
	private int carYear;

	public Car() {
		System.out.println("Inside default Constructor");
	}

	public Car(String carNo, String carName, int carYear) {
		this.carNo = carNo;
		this.carName = carName;
		this.carYear = carYear;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public int getCarYear() {
		return carYear;
	}

	public String toString() {
		return "CarDetails :" + carNo + " " + carName + " " + carYear;
	}
}
