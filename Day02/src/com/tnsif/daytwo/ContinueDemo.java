//Program to demonstrate  continue statement
//continue in Java is used in loops to skip the remaining code in
//the current iteration and move directly to the next iteration. 
//It's often used with an if statement for conditional skipping.
package com.tnsif.daytwo;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int k = 5; k < 15; k++)
		{
		// Odd numbers are skipped
		if (k%2 == 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}
}
