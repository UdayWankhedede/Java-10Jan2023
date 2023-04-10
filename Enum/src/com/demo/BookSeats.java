package com.demo;

import java.util.Scanner;

public class BookSeats {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     
     System.out.println("Enter the seat type(Standard(1),Premium(2),Recliner(3)) :");
     
    int seat= sc.nextInt();
     
     MovieSeats ms=null;
      
     System.out.println("Enter total seats:");
     int num= sc.nextInt();
     if(seat==1)
     {
    	 ms= MovieSeats.STANDARD;
     }
     else if(seat==2)
     {
    	 ms=MovieSeats.PREMIUM;
     }
     else if(seat==3)
     {
    	 ms=MovieSeats.RECLINER;
     }
     else
     {
    	 System.out.println("Wrong value");
     }
     
     switch(ms)
     {
     
     case STANDARD: System.out.println("Standard:"+ ms.price);
                     System.out.println("Total:"+ ms.price*num);
                     break;
                     
                     
     
     }



	}

}
