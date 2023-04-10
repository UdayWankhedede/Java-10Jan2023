package com.abstractex;

public abstract class Bank 
{
	public int Balance ;
	
	public Bank()
	{
		this.Balance = Balance;
	}
	
	public void Credit(int Amount)
	{
		this.Balance = this.Balance + Amount;
	}
	public void Debit(int Amount)
	{
		this.Balance = this.Balance - Amount;
	}
	
	public abstract int CalculateIntrest();
}
