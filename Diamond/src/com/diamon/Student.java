package com.diamon;

public interface Student {

   default void display()
   {
	   System.out.println("I am student");
   }
 
}
