package com.tnsif.dayfour.firstpackage;

public class Excutor {

	public static void main(String[] args) {
		
		Base b=new Base();
		b.methodDefault();
		//b.methodPrivate();
		b.methodProtected();
		b.methodPublic();
		
		b.varDefault=15;
		b.varProtected=25;
		b.varPublic=35;
		//b.varPrivate=45;
		
		
		System.out.println();
		System.out.println();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		
	}

}
