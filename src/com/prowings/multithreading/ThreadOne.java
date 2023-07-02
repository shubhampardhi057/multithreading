package com.prowings.multithreading;

public class ThreadOne extends Thread {
	
	String task;
	
	public ThreadOne(String task) {
		 super();
		 this.task=task;
	}
	
	public void run() {
		
		for(int i = 1;i<=5;i++) {
			
			System.out.println(task+" "+i);
			
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
