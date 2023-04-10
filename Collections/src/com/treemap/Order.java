package com.treemap;

public class Order implements Comparable<Order> {
	
	private int orderId;
	private String name;
	private float price;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String name, float price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Order o) {

		if(this.orderId<o.orderId)
			return -1;
		else if(this.orderId>o.orderId)
			return 1;
		else 
			return 0;

	}
	
}
