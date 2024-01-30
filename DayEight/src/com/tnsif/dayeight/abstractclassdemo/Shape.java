package com.tnsif.dayeight.abstractclassdemo;


//abstract class
public abstract class Shape {

	protected float area;  //4.0
	
	//abstract method
	public abstract void calArea();
	
	//solid method
	public void show()
	{                                              //4.0
		System.out.println("Area of the shape is " + area);
	}
	
	
	
}
