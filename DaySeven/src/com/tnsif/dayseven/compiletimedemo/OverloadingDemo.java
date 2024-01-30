package com.tnsif.dayseven.compiletimedemo;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		Point p1=new Point();
	    System.out.println(p1);
	    
	    Point p2=new Point (3.98f);
	    System.out.println(p2);
	    
	    Point p3=new Point (1.58f,2.98f);
	    System.out.println(p3);
	    
	    
	    System.out.println("--------------------------------------------------------------------");
	    //method overloading

	    MethodOverLoading m=new MethodOverLoading();
	    
	  System.out.println(m.addition(12, 14));  
	   System.out.println(m.addition(23.5f, 27.5f)); 
	   System.out.println(m.addition(12.98f, 12));  
	   System.out.println(m.addition(23f, 23, 100));
	    
	    
	    
	}

}
