package com.tnsif.dayeight.abstractclassdemo;

public class Square  extends Shape {

	float side;

	//Constructor
	public Square() {
		
		side = 2.0f;
	}

	

	public Square(float side) {
		
		this.side = side;
	}



	@Override
	public void calArea() {
		
		this.area=side*side;
		
	}

}
