package com.varags;

public class RulesVarags {
	
	/*public static void display(int...a, String...b)
	{
		
	}*/
	//Rule1: there can be only 1 varag
	
	public static void display(int b,int ...a)
	{
		System.out.println("b:"+b);
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}
	// Rule 2: Varags has to be last argument

	public static void main(String[] args) {
		
		display(8,4,5,2,5);


	}

}
