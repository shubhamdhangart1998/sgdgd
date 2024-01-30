package com.tnsif.dayeight.interfacedemo;

public class BankDemo {
//	AbstractMap
	
	
	

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Aakash", "Pune", 123456, 15000);
		s1.deposit(-30000);
		System.out.println(s1);
		
		s1.withdraw(15000);
		System.out.println(s1);

	}

}
