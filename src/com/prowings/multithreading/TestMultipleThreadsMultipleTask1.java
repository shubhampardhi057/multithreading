package com.prowings.multithreading;

public class TestMultipleThreadsMultipleTask1 {
	
	public static void main(String[] args) {
		
		
		ThreadOne to1 = new ThreadOne("Cut The Ticket !!!");
		
		ThreadOne to2 = new ThreadOne("Show The Seat !!!");
		
		to1.start();
		
		to2.start();
		
	}

}
