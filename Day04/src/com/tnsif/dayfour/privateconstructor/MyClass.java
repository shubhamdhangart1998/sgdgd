package com.tnsif.dayfour.privateconstructor;
/*
 * Make a constructor private.
Write a static method that has the return type object of this singleton class. 
Here, the concept of Lazy initialization is used to write this static method.
 */
public class MyClass {
	
	//MyClass obj1=new MyClass();   //Early Instantiation
	
	private MyClass()
	{
		System.out.println("MyClass object is created");
	}
	
	private static MyClass obj=null;

	//factory method 
	public static MyClass getObject()
	{
		if(obj==null)
		{
			obj=new MyClass(); //Lazy Instantiation
		}
		
		return obj;
	}
}
