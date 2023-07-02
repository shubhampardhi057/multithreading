package com.prowings.interthreadcommunication;

public class ConsumerThread extends Thread {
	
	PC pc;
	
	public ConsumerThread() {
		super();
	}

	public ConsumerThread(PC pc) {
		super();
		this.pc = pc;
	}
	
	public void run() {
		
		try {
			pc.consume();
		}catch (InterruptedException e)
		{

			e.printStackTrace();
		}
		
	}

}
