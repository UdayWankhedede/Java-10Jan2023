package com.demo;

public class Customer 
{
	private int cid;
	private String name;
	private String itemname;
	private float price;
	private String status;
	private String phoneNumber;
	
	public Customer() //default constructor
	{
		System.out.println("Inside default constructor");
		this.itemname = null;
		this.status = "unknown";
		this.price = 0.0f;
	}
	
	public Customer(int cid, String name, String phoneNumber) //Parameterized constructor with 3 arg
	{
		System.out.println("Inside 1 parametrized constructor");
		
		this.cid = cid;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public Customer(int cid, String name, String phoneNumber, String itemName,  float price,String status)
	{
		//to create constructor chaining we have to call above constructor with this keyword by passing argument
		this(cid,name,phoneNumber); // it should always call line 
		System.out.println("Inside 2 parametrized constructor");
		this.itemname=itemName;
		this.status=status;
		this.price=price;
	}
	public void  setCid(int cid)
	{
		this.cid = cid;
	}
	public int getCid()
	{
		return this.cid;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setItemname(String itemname)
	{
		this.itemname = itemname;
	}
	public String getItemname()
	{
		return this.itemname;
	}
	public void setPrice(float price) 
	{
		this.price = price;
	}
	public float getPrice() 
	{
		return price;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String toString()
	{
		return "Customer Details:"+cid+"  "+name+"  "+phoneNumber+"\t Item Details:"+itemname+"  "+price+"  "+status;
	}
}

