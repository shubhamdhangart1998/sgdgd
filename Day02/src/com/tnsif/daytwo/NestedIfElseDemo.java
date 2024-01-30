package com.tnsif.daytwo;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		
		String username="Ashw242ini";
		String password="Ashwini@123";
		
		if(username=="Ashwini")
		{
			System.out.println("correct username");
			
			if(password=="Ashwini@123")
			{
				System.out.println("correct password");
				System.out.println("login successfully");
			}
			
			else
			{
				System.out.println("wrong password");
				System.out.println("login failed");
			}
		}
			else
			{
				System.out.println("wrong username");
				System.out.println("login failed");
			}

		
		
		
//		int a=10, b=20, c=5;
//		System.out.println("The largest number is");
//		if (a > b) {
//			if (a > c)
//				System.out.println(a);
//			else
//				System.out.println(c);
//		} else {
//			if (c > b)
//				System.out.println(c);
//			else
//				System.out.println(b);
		

	}
}
