package com.innerclass;

import java.security.PublicKey;
import java.util.Scanner;

class Bank {
	static String bankName = "SBI";
	String bankLocation;
	int regNo;
	{
		bankLocation = "Delhi";
		regNo = 7856;
	}
	void displayBankDetails()
	{
		System.out.println(bankName+" "+bankLocation+" "+regNo);
	}
	class Locker
	{
		int lockerId;
		String custName;
		static int LockerRent = 2000;
		
		public void entreDetails(int i , String name)
		{
			lockerId = i;
			custName = name;
			System.out.println("the locker " +lockerId + " belong to "+custName+" in the bank"+bankName);
		
			System.out.println();
			displayBankDetails();
			System.out.println("Locker rent "+LockerRent);
		
		}
	}
}

public class SimpleInnerClass {
	public static void main(String[] args) {
		
		Bank bobj1 = new Bank();
	bobj1.displayBankDetails();
		
		Bank.Locker lobj = bobj1.new Locker();
		lobj.entreDetails(1, "Uday");
		
		Bank.Locker lobj2 = bobj1.new Locker();
		lobj.entreDetails(2, "Aditi");
		//lobj.displayBankDetails(); we cannot call it from nested class it only accessible to class
		
		

	}
}
