package com.tnsif.multithreadinddemo;

public class RunaableDemo {

	public static void main(String[] args) {

		//UsingRunneable r=new UsingRunneable(10, 1,"Hiiii");
		
//		Runnable r1=new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("runnable with anoymous class");
//				
//			}
//		};
//		
//		Thread t1=new Thread(r1);
//		t1.start();
		
		Runnable r2=() -> System.out.println("runnable with lamba expression ");
		new Thread(r2).start();
		
	}

}
