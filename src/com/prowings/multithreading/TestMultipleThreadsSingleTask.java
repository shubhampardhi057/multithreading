package com.prowings.multithreading;

class Thread3 extends Thread {
	
	public void m1() 
	{
		
		for(int i =0;i<10;i++) 
		{
		
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		m1();
	}
	
	
}

class Thread4 extends Thread {
	
	public void m2() {
		
		for(int i = 10;i<20;i++) {
			
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		m2();
	}	
}

public class TestMultipleThreadsSingleTask {
	
	public static void main(String[] args) {
		
		Thread3 t3 = new Thread3();
		Thread4 t4 = new Thread4();
		
		t3.setName("t3");
		t4.setName("t4");
		
		t3.start();
		t4.start();
	}
	
	
	
	
	
	
	
	

}
