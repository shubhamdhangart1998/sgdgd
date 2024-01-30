package com.tnsif.daynine.Stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		
		//stringBuffer lenght vs capacity.
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println("buffer = "+ buffer);
		System.out.println("lenght = "+ buffer.length() );
		System.out.println("capacity= "+ buffer.capacity());

		//aapending and inserting into stringbuffer.         a = 42!
		String s;
		int a=42;
		buffer = new StringBuffer(40);
		s=buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer=new StringBuffer("I Java!");
		buffer.insert(2,"like ");
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
		
		
		
	}

}
