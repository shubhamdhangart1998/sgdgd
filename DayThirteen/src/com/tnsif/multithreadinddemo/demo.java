package com.tnsif.multithreadinddemo;

public class demo {

	public static void main(String[] args) {

		Thread myThread=new ThreadLifeCycleDemo();
		System.out.println("Before Runnable stage Thread is alive or not ? " +myThread.isAlive());
		myThread.start();
		
		try {
			Thread.sleep(450);
			
		}
		catch (InterruptedException exp)
		{
			System.err.println("Thread is interrupted   !");
		}
		System.out.println("After complete exceution of thread , it is alive or not ?" + myThread.isAlive());
	}

}
