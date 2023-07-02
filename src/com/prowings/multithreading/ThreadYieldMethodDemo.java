package com.prowings.multithreading;

public class ThreadYieldMethodDemo {
	
        public static void main(String[] args) throws InterruptedException {
		
		MyThreadT1 t1 = new MyThreadT1("T1");

		MyThreadT2 mt2 = new MyThreadT2();
		
		Thread t2 = new Thread(mt2,"T2");
		
		t1.setPriority(8);
		t2.setPriority(8);

		t1.start();
//		t1.join();
		t2.start();
		t2.yield();
		
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		
	}

}
