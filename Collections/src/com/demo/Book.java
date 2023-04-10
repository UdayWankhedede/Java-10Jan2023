package com.demo;

import java.util.Comparator;

public class Book {
	
	private int id;
	private String name;
	private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}


class priceComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {

		if(o1.getPrice() == o2.getPrice())
		{
			return 0;
		}
		else if(o1.getPrice() > o2.getPrice())
		
			return 1;
		
		else
			return -1;
	
	
		
	}
	
}