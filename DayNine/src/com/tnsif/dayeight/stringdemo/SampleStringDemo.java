package com.tnsif.dayeight.stringdemo;

public class SampleStringDemo {

	public static void main(String[] args) {
		//initialise string 
		
		char c[]= {'I','n','d','i','a'};
		
		
		
		String s1=new String(c);
		String s2=new String (s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		//concatenation to prevent long lines 
		String longStr="This is to show" + " how long sentences" + " can be printed ";
		
		System.out.println(longStr);
		
		
	}
}
