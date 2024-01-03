package com.tnsif.daysix.finalvariblesdemo;

public class FinalVarible {

	//declare varibles
	
//	final int x;  // final varible must be initialized 
//	private int q;
//	String adb;
	
	final int x=34;  // non static 
	
	final static int y;  //static
	
	
	final static int z=100;
	
	
	public void change()
	{
		//x=30;
		//y=20;
	//	z=23;
		
	}
	
	//declare static block
	static 
	{
		
		
		//x=34;  // non static not allowed
		y=50;
		//z=105;
		
	}
	
	

	
	
	
	
	
}
