package com.prowings.multithreading;

public class Display {

	public void print(String message) {

		System.out.println(Thread.currentThread().getName() + " Before....");
		System.out.println(Thread.currentThread().getName() + " Before....");
		
		
	
		 synchronized (this) {
			
			System.out.print("["+message);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("]");
			
		}

		System.out.println(Thread.currentThread().getName() + " After....");
		System.out.println(Thread.currentThread().getName() + " After....");
	}
	
		

}
