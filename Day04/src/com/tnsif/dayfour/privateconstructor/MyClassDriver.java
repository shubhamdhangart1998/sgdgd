package com.tnsif.dayfour.privateconstructor;

public class MyClassDriver {

	public static void main(String[] args) {
		
		
		//MyClass m1=new MyClass();
		
		MyClass obj= MyClass.getObject();
		MyClass obj1=MyClass.getObject();
		System.out.println(obj==obj1);
		System.out.println(obj);
		System.out.println(obj1);
	}
}
