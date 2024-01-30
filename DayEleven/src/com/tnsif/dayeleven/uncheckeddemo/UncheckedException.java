package com.tnsif.dayeleven.uncheckeddemo;

import java.util.Arrays;

public class UncheckedException {

	public static void main(String[] args) {
		
		
		//declare array
		int x[];
	//	System.out.println(Arrays.toString(x));
		try {
		x=new int[] {1,2,3,4,5,6};
		System.out.println(x[10]);
		}
		catch(ArrayIndexOutOfBoundsException  ae)
		{
			System.err.println("specified index does not exist "+ae.getMessage());
		}

		System.out.println("end of the program");

	}

}
