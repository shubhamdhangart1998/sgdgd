package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor extends Base  {

	public static void main(String[] args) {

		Base b2=new Base();
		//b2.methodDefault();
		//b2.methodPrivate();
	//	b2.methodProtected();
		b2.methodPublic();
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		
		
		b2.access();
		
		
		System.out.println("-------------------------------------------------");
		//b2.varDefault=15;
	//	b2.varProtected=25;
		b2.varPublic=35;
		//b2.varPrivate=45;
		
		Executor ex=new Executor();
	//ex.varDefault=15;
		ex.varProtected=805;
		ex.varPublic=305;
	//	ex.varPrivate=45;
		
		ex.methodProtected();
		ex.methodPublic();
	}

}




















/*
 * 
 * Netflix TV mobile 
 * 
 * AmazonPrime
 * 
 * 
 * 
 */



