package com.tnsif.singleDimensiondemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
	
		
		//get the array
		
		int intArr[]= {69,20,12,40,35};
		
		//print the array 
		
		System.out.println(Arrays.toString(intArr));
		for( int i=0;i<intArr.length;i++)
		{
			System.out.println(intArr[i]);
		}
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary Search 
	// int key=7;
	 System.out.println(Arrays.binarySearch(intArr, 35));
	 
	 System.out.println(Arrays.binarySearch(intArr, 2, 4, 35));
	 
	 //comparison
	 
	 System.out.println(Arrays.toString(intArr));
	 
	 //get the second array
	 int intArr1[]= {69,20,12,40,35};
	// System.out.println(Arrays.toString(intArr1));
	 
		//sort
	//	Arrays.sort(intArr1);
		System.out.println(Arrays.toString(intArr1));
	 
	 //compare both the arrays
	 if(Arrays.compare(intArr, intArr1)==0)
	 {
		 System.out.println("Both the arrays are same ");
	 }
	 else
	 {
		 System.out.println("Both arrays are not same ");
	 }
	 
	 //copy array
	 int intArr2[]=Arrays.copyOf(intArr1, 2);
	 System.out.println(Arrays.toString(intArr2));
	 
	 int intArr3[]=Arrays.copyOfRange(intArr, 1, 4);
	 System.out.println(Arrays.toString(intArr3));
	 
	 //Fill method 
	 Arrays.fill(intArr3, 7);
	 System.out.println(Arrays.toString(intArr3));
	 

	}

}


/*Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
Random access: We can get any data located at an index position.
*/
