package com.prowings.multithreading;

public class PrintHello {
	
	
	public synchronized void print() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " holds lock : " +Thread.currentThread().holdsLock(this));
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName() +"  Hello "+ i);
			if(i==5) {
//				Thread.currentThread().sleep(5000);
				this.wait(5000);
			}
		}
	}

}
