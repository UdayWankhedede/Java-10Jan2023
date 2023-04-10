package com.demo;

class customer
{
	//characterstics
	private int cid;
	private String cname;
	private String itemname;
	private float price;
	private String Status;
	private String phoneNumber;
	
	public customer()
	{
		System.out.println("defaukt constructor");
	}
	
	public customer(int cid, String cname, String phoneNumber)
	{
		System.out.println("Para constructor");
		this.cid = cid;
		this.cname = cname;
		this.phoneNumber = phoneNumber;
		this.itemname = null;
		this.Status = "unknown";
		this.price =  0.0f;
	}
	//here we overload constructor with number of parameter
	public customer (int cid, String cname, String itemname, float price, String Status, String phoneNumber)
	{
		this.cid = cid;
		this.cname = cname;
		this.phoneNumber = phoneNumber;
		this.itemname = itemname;
		this.Status = Status;
		this.price = price;
	}
	
	//here we are accepting the value
	public void SetCid(int cid)
	{
		this.cid =cid;
	}
	//here we are display the value
	public int getCid()
	{
		return this.cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

}

