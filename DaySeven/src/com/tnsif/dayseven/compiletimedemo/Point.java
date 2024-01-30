package com.tnsif.dayseven.compiletimedemo;

public class Point {
	private float x;
	private float y;
	
	
	
	//default constructor
	public Point() {
		
		x = 0.0f;
		y = 0.0f;
	}
	//para constructor
	public Point(float x) {
		super();
		this.x = x;
		this.y = y;
	}

	   //para constructor/ constructor overloadling
		public Point(float x, float y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
	

		
		
}
   
