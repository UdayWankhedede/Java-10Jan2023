package com.payment;

public class PersonTax implements Payment {
	
	public void pay(double amount)
	{
		double tax;
		tax = 0.3* amount;
		System.out.println("Pay the tax : "+tax);
	}
	

}
