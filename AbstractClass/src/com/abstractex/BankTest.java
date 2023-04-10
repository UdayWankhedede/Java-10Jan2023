package com.abstractex;

public class BankTest {
	public static void main(String a[]) {
		
		PNB pobj = new PNB();
		SBI sobj = new SBI();
		System.out.println("Credit");
		pobj.Credit(1000);
		System.out.println("Debit");
		pobj.Credit(200);
		int iRet = 0;
		 iRet = pobj.CalculateIntrest();
		System.out.println(iRet);
		 iRet = sobj.CalculateIntrest();
		System.out.println(iRet);
	}

}
