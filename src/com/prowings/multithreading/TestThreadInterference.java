package com.prowings.multithreading;

public class TestThreadInterference {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		MT1 t1 = new MT1(counter);
		
		MT2 t2 = new MT2(counter);
		
	
		t1.start();
		
		System.out.println("Thread Priority :"+t1.getPriority());
		
		t2.start();
		
	}

}	
