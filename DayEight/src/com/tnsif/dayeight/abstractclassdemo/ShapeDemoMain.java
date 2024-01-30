package com.tnsif.dayeight.abstractclassdemo;

public class ShapeDemoMain {

	public static void main(String[] args) {
		
		Square s=new Square();
		s.calArea();
		s.show();
		
		Rectangular r=new Rectangular();
		r.calArea();
		r.show();
		
		
		//dynamic binding//runtime poly//late binding
		
		Shape s1;
		s1=new Square(3.0f);
		s1.calArea();
		s1.show();
		
		
		s1=new Rectangular(2,4);
		s1.calArea();
		s1.show();
		
		

	}

}
