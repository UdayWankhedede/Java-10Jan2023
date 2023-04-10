package com.Demo;

import java.util.Scanner;

public class EnhancedSwitch {

	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("");
		String course = sobj.next();	
		switch(course)
		{
		case "Java","C","C++" -> System.out.println("programming language");
		
		case "Sql","Oracle","Mongodb+" -> System.out.println("Database Course");
		
		case "cloud","aws","bigdata++" -> System.out.println("Other course");
		
		default -> System.out.println("No course available");
		}
		sobj.close();

	}

}
