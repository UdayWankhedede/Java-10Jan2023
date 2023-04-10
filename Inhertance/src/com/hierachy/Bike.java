package com.hierachy;

public class Bike 
{
	private int modelNo;
	private String brand;
	private float price;
	
	public Bike()
	{
		System.out.println("Inside Bike default constructor");
	}

	public Bike(int modelNo,  String brand,float price) {
		System.out.println("Inside Bike parametrized constructor");
		this.modelNo = modelNo;
		this.brand = brand;
		this.price = price;
		
		
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public String toString() {
		return "Bike [modelNo=" + modelNo + ", price=" + price + ", brand=" + brand + "]";
	}
	

}
