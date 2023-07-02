package com.prowings.multithreading;

public class MHT2 extends Thread {
	
	Print p;

	public MHT2(Print p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		
		System.out.println("MHT2 is Running !!!");
		
		p.printMsg("Hello");
		
	}
	
	

}
