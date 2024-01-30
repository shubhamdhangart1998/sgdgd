package com.tnsif.dayseven.runtimedemo;

public class OverridingDemo {

	public static void main(String[] args) {
	
		RBI rbi;
		
		
		rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		
		
		
		rbi=new Axis();
		System.out.println(rbi.getRateofInterest());
		
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());

	}

}
