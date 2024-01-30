package com.tnsif.dayseven.covariantoverridingdemo;


class Colour {

	protected Colour getColour()
	{
		Colour s=new Colour();
		return s;
	}
}

//child class
class Red extends Colour{
	
	protected Red getColour()
	{
		Red s=new Red();
		return s;
	}
	
}

//child class
class Green extends Colour{
	
	protected Green getColour()
	{
		Green s=new Green();
		return s;
	}
	
}
public class CovariantOverridingDemo {

	public static void main(String[] args) {


		Colour c=new Colour();
	     System.out.println(c.getColour());

	     Red r =new Red();
	    System.out.println( r.getColour());
	     
	}

}
