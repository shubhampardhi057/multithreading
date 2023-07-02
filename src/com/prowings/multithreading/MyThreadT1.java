package com.prowings.multithreading;

public class MyThreadT1 extends Thread {
	
	String name;

	public MyThreadT1(String name) {
		super(name);
	}
	public MyThreadT1() {
		super();
	}

	@Override
	public void run() {

		System.out.println("mythreadT1 running!!!");

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "   " + i);
		}

	}


}
