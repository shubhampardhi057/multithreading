package com.prowings.multithreading;

public class WaitAndSleepDemo {
	
	private static WaitAndSleepDemo LOCK = new WaitAndSleepDemo();

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main thread started!!");
		Thread.sleep(5000);

		System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");


		synchronized (LOCK) {
			LOCK.wait(3000);
			System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
		}

	}


}
