package com.tnsid.dayeight.nestedinterfacedemo;

public class NestedDemo  implements OuterInterface, OuterInterface.InnerInterface{


	@Override
	public void print() {
		
		System.out.println("Inner interface ");
		
	}

	@Override
	public void calArea() {
	
		System.out.println("fsfsfsc");
		
	}

	
}
