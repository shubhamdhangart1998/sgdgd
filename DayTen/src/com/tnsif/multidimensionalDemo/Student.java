package com.tnsif.multidimensionalDemo;

public class Student {

	
	//Student [] arr
	//int     c   []
	// datatype name arr symbol
	private int rollNo;
	private String name;
	
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
