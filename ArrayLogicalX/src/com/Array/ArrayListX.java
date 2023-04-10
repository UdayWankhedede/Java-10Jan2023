package com.Array;
import java.util.*;


public class ArrayListX
{
	
public static void CommonElements(ArrayList<String>alist,ArrayList<String>alist2)

{
	System.out.println("same the elements");
	for(int i =0; i <alist.size();i++)
	{
		if(alist2.contains(alist.get(i)))
		{
			System.out.println(alist.get(i));
		}
	}
}
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		ArrayList<String> alist = new ArrayList<String>();  
		
		
		alist.add("Java");
		alist.add("C");
		alist.add("Python");
		alist.add("Angular");
		alist.add("C#");
		
		ArrayList<String> alist2 = new ArrayList<String>();  
		
		alist2.add("Spring");
		alist2.add("C");
		alist2.add("Html");
		alist2.add("Angular");
		alist2.add("C++");
		
	}

}
