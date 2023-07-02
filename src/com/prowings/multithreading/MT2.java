package com.prowings.multithreading;

public class MT2 extends Thread{
	
	Counter counter;

	public MT2(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		
		
		System.out.println("MT2 running increment operation !!!");
		
		System.out.println(Thread.currentThread().getName());
		
		counter.decrement();
		
		System.out.println("After decrement c :"+counter.value());
	}
	
	

}
