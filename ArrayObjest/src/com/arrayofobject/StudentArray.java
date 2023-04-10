package com.arrayofobject;

public class StudentArray {
	
	public static void displayAll(Student stud[])
	{
		 Subject subj[]; 
	       System.out.println("Students record:");
	       
	       for(Student s:stud)
	       {
	    	   System.out.println(s.getId()+" "+s.getName());
	    	   subj= s.getSubject();
	    	   for(Subject subs:subj)
	    	   {
	    		   System.out.println(subs);
	    	   }
	    	   System.out.println("----------------------------------");
	       }
	       
		
	}
	
	public static void displayMarks(Student stud[])
	{
		 Subject subj[]; 
	      
		 for(Student s:stud)
	       {
	    	   if(s.getName().equals("Bhushan"))
	    	   {
	    		   subj= s.getSubject();
	    		   for(Subject subs:subj)
	        	   {
	        		   System.out.println(subs);
	        	   }
	    	   }
	       }
	       
	       System.out.println();
	       System.out.println();
	       
		
	}
	
	public static void displayNames(Student stud[])
	{
		 Subject subj[]; 
         System.out.println("Computers");
	       //student having computer subject
	       for(Student s:stud)
	       {
	    	   subj= s.getSubject();
	    	   for(Subject su:subj)
	    	   {
	    		   if(su.getSubName().equals("Computer"))
	    			   System.out.println(s.getName());
	    	   }

	       }
	       
		
	}

	public static void main(String[] args) {

       Student stud[]= new Student[3];
       
       Subject sb[]= new Subject[3];
       sb[0]= new Subject(1,"Maths",89.0f);
       sb[1]= new Subject(2,"Science",98.3f);
       sb[2]= new Subject(3,"English",78.5f);
       
       stud[0]= new Student(101,"Bhushan",sb);
       
       Subject sb1[]= new Subject[2];
       sb1[0]= new Subject(1,"Maths",86.0f);
       sb1[1]= new Subject(2,"Computer",78.3f);
       
       
       stud[1]= new Student(102,"Suyog",sb1);
       
       Subject sb2[]= new Subject[4];
       sb2[0]= new Subject(1,"Maths",87.0f);
       sb2[1]= new Subject(2,"Science",58.3f);
       sb2[2]= new Subject(3,"English",98.5f);
       sb2[3]= new Subject(4,"Computer",68.5f);
       
       stud[2]= new Student(101,"Rupali",sb2);
       
      /* System.out.println("Students record:");
       
       for(Student s:stud)
       {
    	   System.out.println(s);
    	   System.out.println("----------------------------------");
       }*/
       
     
       displayAll(stud);
       
       System.out.println();
       System.out.println();
       
       // display marks of particular student
       
       displayMarks(stud);
      
       // display students having particular subject
       displayNames(stud);
       

	}

}
