package com.demo;

public class BankAccount 
{
	private int acid;
	private long accountNumber;
	private String name;
	private double balance;
	private long debitCard;
	public BankAccount() {
		
	}
	public BankAccount(int acid, long accountNumber, String name, double balance, long debitCard) {
		this.acid = acid;
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.debitCard = debitCard;
	}
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(long debitCard) {
		this.debitCard = debitCard;
	}
	
	
	
	
}
