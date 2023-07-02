package com.prowings.multithreading;

public class MHT1 extends Thread {
	
	Print p;
	
	

	public MHT1(Print p) {
		super();
		this.p = p;
	}



	@Override
	public void run() {
		
		System.out.println("MHT1 is Running !!!");
		
		p.printMsg("Hii");
		
		
	}
	
	

}
