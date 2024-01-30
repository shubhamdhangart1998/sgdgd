package com.tnsif.Constructor;

public class DefaultConstructor {

	
	public void m1()
	{
		System.out.println("running default constructor method m1");
	}
	public void m2()
	{
		System.out.println("running default constructor method m2");
	}
	
	
	public static void main(String[] args) {

		
		
		DefaultConstructor df=new DefaultConstructor();
		df.m1();
		df.m2();
	}

}
