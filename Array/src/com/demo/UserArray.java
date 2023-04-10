package com.demo;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {

	   Scanner sc= new Scanner(System.in);	
       float sub[]= new float[5];
       
       
       for(int i=0;i<5;i++)
       {
    	   System.out.println("Enter marks of subject "+(i+1)+":" );
    	   sub[i]= sc.nextFloat();
       }
       System.out.println("-------------------");
       
       for(int i=0;i<5;i++)
       {
    	   System.out.println("Subject "+(i+1)+":"+sub[i]);
       }
       
       
      

	}

}
