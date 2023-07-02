package com.prowings.multithreading;

public class PTestSleepAndWaitBehaviourCheck {
	
	public static void main(String[] args) {
		
	
	PrintHello p = new PrintHello();
	
	PThread t1 = new PThread(p);
	PThread t2 = new PThread(p);
	
	t1.setName("T1");
	t2.setName("T2");
	t1.setPriority(3);
	t2.setPriority(8);
	
	t1.start();
	t2.start();

	}
}
