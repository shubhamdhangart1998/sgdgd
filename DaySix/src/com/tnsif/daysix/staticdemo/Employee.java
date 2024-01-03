package com.tnsif.daysix.staticdemo;

public class Employee {
	
	//declare instance varible
	
	private String name;   //shubham sanket vikas mahesh aaksah
	private int id;   ///101,102,103
	
	//declare static varible
	static String companyName="TNS";

	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyName=" + companyName + "]";
	}

	
	
	
}
