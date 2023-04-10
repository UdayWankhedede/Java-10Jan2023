package com.demo;

import java.util.Scanner;

public class BookSeats2 {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     
     System.out.println("Enter the seat type(Standard(1),Premium(2),Recliner(3)) :");
     
    int seat= sc.nextInt();
     
     MovieSeats ms=null;
      
     System.out.println("Enter total seats:");
     int num= sc.nextInt();
         
     switch(seat)
     {
     
     case 1:  ms= MovieSeats.STANDARD;
    	     System.out.println("Standard:"+ ms.price);
             System.out.println("Total:"+ ms.price*num);
             break;
             
     case 2:   ms= MovieSeats.PREMIUM;
              System.out.println("Premium:"+ ms.price);
              System.out.println("Total:"+ ms.price*num);
               break; 
     case 3:   ms= MovieSeats.RECLINER;
               System.out.println("Recliner:"+ ms.price);
              System.out.println("Total:"+ ms.price*num);
              break; 
     default: System.out.println("Wrong choice");         
                     
                     
     
     }



	}

}
