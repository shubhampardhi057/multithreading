package com.prowings.multithreading;

public class MT1 extends Thread {
	
	Counter counter;

	public MT1(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		
		
		System.out.println("MT1 running increment operation !!!");
		
		System.out.println(Thread.currentThread().getName());
		
		counter.increment();
		
		System.out.println("After increment c :"+counter.value());
	}
	
	

}
