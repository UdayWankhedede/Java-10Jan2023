package com.demo3;

public class Book {
	private String Name;
	private int price;
	private String BookType;
	private Author auth;
	
	public Book()
	{
		System.out.println("Inside default constructor");
	}

	public Book(String name, int price, String bookType, Author auth) 
	{
		this.Name = name;
		this.price = price;
		this.BookType = bookType;
		this.auth = auth;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookType() {
		return BookType;
	}

	public void setBookType(String bookType) {
		BookType = bookType;
	}

	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

	public String toString() {
		return "Book [Name=" + Name + ", price=" + price + ", BookType=" + BookType + ", auth=" + auth + "]";
	}
	
}
