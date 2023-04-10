package com.demo;

import java.util.Scanner;

public class SBIBank {

	public static void main(String[] args) 
	{
		
		Scanner sobj = new Scanner(System.in);
		BankAccount a1 = new BankAccount();
		
		a1.setAcid(sobj.nextInt());
		System.out.println("Entre the account id ");
	}

}
