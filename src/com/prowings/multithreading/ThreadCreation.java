package com.prowings.multithreading;

public class ThreadCreation {
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		
		t1.start();
		
		t1.setName("Thread1");
		
		System.out.println("@ t1 Name :- "+t1.getName());
		
		System.out.println("Thread1 created !!!");
		
		
		
			
		
		
		
		Thread2 t2 = new Thread2();
		
		Thread Thread2 = new Thread(t2);
		
		Thread2.start();
		
		Thread2.setName("Thread2");
		
		System.out.println("@ t2 Name :- "+ Thread2.getName());
		
		System.out.println("Thread2 Created !!!");
	}

}
