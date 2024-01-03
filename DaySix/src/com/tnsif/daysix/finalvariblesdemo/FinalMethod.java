package com.tnsif.daysix.finalvariblesdemo;

final public class FinalMethod {

	int a=10;
	
	public FinalMethod() {

		System.out.println("Default constructor");

	}

	//final method
	final void show()
	{
		System.out.println("value of varible a "+ a);
	}
	
	public void  print()
	{
		System.out.println("hello");
	}
	
	
}
