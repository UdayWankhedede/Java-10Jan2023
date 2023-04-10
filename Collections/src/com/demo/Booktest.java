package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class Booktest {
	public static void main(String[] args) {
		
		ArrayList<Book> bList = new ArrayList<>();
		
		bList.add(new Book(101,"DC",200));
		bList.add(new Book(101,"MCU",3050));
		bList.add(new Book(101,"Dark",5000));
		bList.add(new Book(101,"Stranger",4200));
		
		System.out.println("Before");
		
		for(Book b : bList)
		{
			System.out.println(b);
		}
		
		System.out.println("Before");
		
		Collections.sort(bList, new priceComparator());
		
		for(Book Book : bList)
		{
			System.out.println(bList);
		}
		
	}

}
