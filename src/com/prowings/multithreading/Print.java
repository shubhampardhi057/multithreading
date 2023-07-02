package com.prowings.multithreading;

public class Print {
	
	public synchronized void printMsg(String msg) {
		
		System.out.println("Before Shubham  1 :"+ Thread.currentThread().getName());
		System.out.println("Before Shubham  2 :"+ Thread.currentThread().getName());
		
		
		
		synchronized (this) {
			
			
			for(int i =0;i<4;i++) 
			{
				System.out.println(Thread.currentThread().getName()+"  :  "+ msg);
				
				try {
					Thread.sleep(1000);
				} 
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		System.out.println("After Shubham 3 :"+ Thread.currentThread().getName());
		System.out.println("After Shubham 4 :"+ Thread.currentThread().getName());
		
	}
		
		
		

}
