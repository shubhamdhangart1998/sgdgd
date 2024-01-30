package com.tnsif.Constructor;

public class Customer {
	
	private int customerid;
	private String customerName;
	private int mobno;
	
	Customer()
	{
		customerid=12;
		customerName="Vikas";
		mobno=876543;
		
		System.out.println("Default constructor");
	}

	public Customer(int customerid, String customerName, int mobno) {
	
		
		this.customerid = customerid;
		this.customerName = customerName;
		this.mobno = mobno;
	}
//
//	public Customer() 
//	{
//    	System.out.println("Default constructor");
//	}

	
	//generated the getter and setter methiod for my varibles
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	
	//toString Object 
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", mobno=" + mobno + "]";
	}
	
	
}
