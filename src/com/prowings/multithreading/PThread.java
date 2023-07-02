package com.prowings.multithreading;

public class PThread extends Thread {

	PrintHello p;

	public PThread() {
		super();
	}

	public PThread(PrintHello p) {
		super();
		this.p = p;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " running!!");

		try {
			p.print();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
