package com.custommap;

import java.util.Objects;

public class Course {
	
	private int cid;
	private String cname;
	private int price;
	
	public Course(int cid, String cname, int price) 
	{
		super();
		this.cid = cid;
		this.cname = cname;
		this.price = price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", price=" + price + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cid == other.cid && Objects.equals(cname, other.cname) && price == other.price;
	}
	
	

}
