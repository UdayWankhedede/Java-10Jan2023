package com.demo3;

public class Author 
{
	private String name;
	private int id;
	private String BirthDate;
	
	public Author()
	{
		System.out.println("Inside default constructor");
	}



	public Author(String name, int id, String BirthDate) {
		System.out.println("Inside Department paramertirzed Construcor");
		this.name = name;
		this.id = id;
		this.BirthDate = BirthDate;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String toString() {
		return "Author [name=" + name + ", id=" + id + ", BirthDate=" + BirthDate + "]";
	}
	
	
}
