package com.Bank;

public class BankTest {

	public static void main(String[] args) {

       SBI sb= new SBI();
       sb.setRateOfInterest();
       System.out.println(sb.getRateOfInterest());
       
       SBI sb1= new SBI();
       sb1.setRateOfInterest();
       System.out.println(sb1.getRateOfInterest());
       
       CanaraBank cb= new CanaraBank();
       cb.setRateOfInterest();
       System.out.println(cb.getRateOfInterest());
       
       
       sb1.setRateOfInterest(9.6f); // changes Bank 
       
       System.out.println(sb.getRateOfInterest());
       System.out.println(sb1.getRateOfInterest());
       System.out.println(cb.getRateOfInterest());
          
       
       

	}

}

