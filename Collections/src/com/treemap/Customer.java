package com.treemap;

public class Customer  implements Comparable<Customer>{
	
	private int custId;
	private String name;
	private long mobile;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String name, long mobile) {
		super();
		this.custId = custId;
		this.name = name;
		this.mobile = mobile;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobile=" + mobile + "]";
	}
	@Override
	public int compareTo(Customer o) {

		if(this.custId<o.custId)
			return -1;
		else if(this.custId>o.custId)
			return 1;
		else 
			return 0;

	}
	
	

}
