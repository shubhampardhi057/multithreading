package com.prowings.interthreadcommunication;

public class TestITC {
	
	public static void main(String[] args) throws InterruptedException {
		
		PC pc = new PC();
		
		ProducerThread t1 = new ProducerThread(pc);
		ConsumerThread t2 = new ConsumerThread(pc);
		
		
//		Start both threads
		
		t1.start();
		t2.start();
		
//		t1 finishes before t2
		
		t1.join();
		t2.join();
	}

}
