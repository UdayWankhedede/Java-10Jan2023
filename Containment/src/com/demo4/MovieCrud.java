package com.demo4;

import java.util.Scanner;

public class MovieCrud {

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	 Theatre t= new Theatre();
	
     int choice;
     do
     {
       	 System.out.println("1. Enter a theatre");
    	 System.out.println("2. Enter movie in theatre");
    	 System.out.println("3. Display theatre");
         System.out.println("4. Exit");
       	 
    	 choice= sc.nextInt();
    	 
    	  switch(choice)
    	  {
    	
    	  case 1:
    		     System.out.println("Enter theatre id:");
    	         t.setTheatreId(sc.nextInt());
    	         System.out.println("Theatre name:");
    	         t.setTheatreName(sc.next());
    	         System.out.println("Enter location:");
    	         t.setLocation(sc.next());
    	         //System.out.println(t);
    	         break;
    	  case 2: Movie m= new Movie();
		         System.out.println("Enter movie id:");
		          m.setMovieiId(sc.nextInt());
		          System.out.println("Enter movie name:");
		          m.setMovieName(sc.next());
		         System.out.println("Enter releasedate(yyyy-mm-dd):");
		          m.setMovieDate(sc.next());  
		          t.setMovie(m);
		          break;
    	  case 3:System.out.println(t);
    	         break;
    	  case 4: System.exit(0);
    	           break;
    	  default: System.out.println("Error");        
    	  }
    	  
    	  System.out.println("Do you want to perform more operation(1-yes/0-no)");
		   choice= sc.nextInt();
    	}while(choice==1);
    	 
    	 
     

	}

}
