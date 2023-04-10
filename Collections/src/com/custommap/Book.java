package com.custommap;

public class Book {
	private int id;
	private String name;
	private float price;
	private Object Author;
	public Book(int id, String name, float price, Author author) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.Author = Author;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public void setAuthor(Object author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Object getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
