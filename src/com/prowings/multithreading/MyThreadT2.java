package com.prowings.multithreading;

public class MyThreadT2 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("mythreadT2 running!!!");
		
		for(int i=0; i<15; i++)
		{
			System.out.println(Thread.currentThread().getName() +"   "+ i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
