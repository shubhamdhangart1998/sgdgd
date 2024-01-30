package com.tnsif.Constructor;

import java.util.Scanner;

public class CustomerDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int custid;
		String custname;
		int custmob;
		
		
		System.out.println("Enter Customer Id");
		custid=sc.nextInt();
		System.out.println("Enter Customer Name");

		custname=sc.next();
		
		System.out.println("Enter Customer mobile");

		custmob=sc.nextInt();
		
		Customer c2=new Customer(custid, custname, custmob);
		System.out.println(c2);
		
		
		
		Customer c=new Customer();
		c.setCustomerid(12356);
		c.setCustomerName("Shubham");
		c.setMobno(5456456);
		System.out.println(c);

		
		System.out.println(c.getCustomerid()+" "+c.getCustomerName()+" "+c.getMobno());
		
		
//		Customer c=new Customer();
//		System.out.println(c);
//		
//		Customer c1=new Customer(123, "shubham", 654321);
//		System.out.println(c1);
//	
		
		sc.close();
		sc.next();
	}

}
