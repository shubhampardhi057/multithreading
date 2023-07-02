package com.prowings.interthreadcommunication;

public class ProducerThread extends Thread {
	
	PC pc;

	public ProducerThread() {
		super();
	}

	public ProducerThread(PC pc) {
		super();
		this.pc = pc;
	}
	
	public void run() {
		
		try {
			
			pc.produce();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
