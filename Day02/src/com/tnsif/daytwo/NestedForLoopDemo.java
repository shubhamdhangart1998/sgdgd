//Program to demonstrate nested loops
package com.tnsif.daytwo;



public class NestedForLoopDemo {
	public static void main(String[] args) {
		// program to print the multiplication tables in a given range by using nested
		// for loop
		int beg=10;
		int end=20;

		for (int i = 10; i <= 20; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}

	}
}


/*
 * 
 * 
 * table 10 to 20 
 * 
 * 10 * 1     11 * 1  12  13 14 15 16 20
 * 10 * 2     11 * 2 
 * 10 * 3     11 * 3
 * 10 * 4     11 * 4
 * 10 * 5     11 * 5
 * 10 * 6     11 * 1
 * 10 * 7     11 * 1
 * 10 * 8     11 * 1
 * 10 * 9     11 * 1
 * 10 * 10    11 * 1
 * 
 *
 * 
 * 
 */




















