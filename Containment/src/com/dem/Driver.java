package com.dem;

public class Driver {
	private String dName;
	private long dLicence;
	private int dExperience;

	private Car car; // created refernce

	public Driver() {
		System.out.println("inside defaut constructor");
	}

	public Driver(String dName, long dLicence, int dExperience) {
		System.out.println("inside 1st parametrized constructor");
		this.dName = dName;
		this.dLicence = dLicence;
		this.dExperience = dExperience;
	}

	public Driver(String dName, long dLicence, int dExperience, Car car) {
		this(dName, dLicence, dExperience);
		this.car = car;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdName() {
		return dName;
	}

	public void setdLicence(long dLicence) {
		this.dLicence = dLicence;
	}

	public long getdLicence() {
		return dLicence;
	}

	public void setdExperience(int dExperience) {
		this.dExperience = dExperience;
	}

	public int getdExperience() {
		return dExperience;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}
	
	public String toString()
	{
		return "Driver Details : " + dName + " " + dLicence + " " + dExperience +" " + car; 
	}

}
