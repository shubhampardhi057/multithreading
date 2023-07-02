package com.prowings.multithreading;

public class TestThreadSynchronization {
	
	public static void main(String[] args) {
		
		Print p = new Print();
		
		MHT1 t1 = new MHT1(p);
		
		MHT2 t2 = new MHT2(p);
		
		
		t1.start();
		
		t2.start();
		
		
	}

}
