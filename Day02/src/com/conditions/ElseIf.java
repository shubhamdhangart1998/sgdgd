package com.conditions;

public class ElseIf {

	public static void main(String[] args) {

		double marks=8.65;
		
		if(marks>=35 && marks<60)
		{
          System.out.println("Candidate is pass");			
		}
		else if (marks>=60 && marks<85)
		{
			System.out.println("candidate is in first class");
		}
		else if (marks>=86 && marks<=100)
		{
			System.out.println("candidate is in first with distintion  class");
		}
		else 
		{
			System.out.println("candidate is fail");
		}
		
	}

}
