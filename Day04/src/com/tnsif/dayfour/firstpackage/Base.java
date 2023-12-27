package com.tnsif.dayfour.firstpackage;

public class Base {

	//decalre all types of data members
	
	int varDefault =10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	
	//declare methods of different types
	
	 void methodDefault()
	{
		System.out.println("Default method");
		System.out.println("varDefault " + varDefault);
	}
	 
	 public void methodPublic()
	 {
		 System.out.println("Public method");
		 System.out.println("Public variable "+ varPublic);
	 }
	 
	 private void methodPrivate()
	 {
		 System.out.println("Private method");
		 System.out.println("Private varible "+ varPrivate);
	 }
	 
	 protected void methodProtected()
	 {
		 System.out.println("Protected method ");
		 System.out.println("Protected varible "+ varProtected);
	 }
	 
	 public void access()
	 {
		methodProtected();
		varProtected=27;
		methodProtected();
		
		varPrivate=10000;
		methodPrivate();
		System.out.println("hiii");
		
		
	 }
	 
	 
	 public static void main(String[] args) {
		Base b=new Base();
		b.methodDefault();
		b.methodPrivate();
		b.methodProtected();
		b.methodPublic();
	}
	
	
}
