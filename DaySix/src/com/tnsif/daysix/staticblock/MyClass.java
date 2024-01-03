package com.tnsif.daysix.staticblock;

public class MyClass {
	
	private int section; //Non static
	private static int srNo; //static   //100
	
	
	//static block
	

	static {
		
		System.out.println("In static block");
		srNo=100;
	//	section=10;  //can not use non static members
		
		
		
	}

//default constructor
	public MyClass() {
		System.out.println("Default constructor");
		srNo++;
		section++;


		
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ",srNo=" + srNo + "]";
	}
	
	
	//static method
	static void display()
	{
		System.out.println(srNo);
		//System.out.println(section);
	}
	
	
	//non static method 
	public void print()
	{
		System.out.println(srNo);
		System.out.println(section);
	}
	
	

}
