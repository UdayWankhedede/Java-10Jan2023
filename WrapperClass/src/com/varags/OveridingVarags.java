package com.varags;

class Demo
{
	
   void display(Integer ...x)
   {
	   for(int i:x)
	   {
		   System.out.println(i);
	   }
   }

}

class Child extends Demo
{
	void display(Integer ...x)
	   {
		   for(int i:x)
		   {
			   System.out.println(i);
		   }
	   }


}

public class OveridingVarags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
