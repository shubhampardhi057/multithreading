package com.prowings.multithreading;

public class TestDisplay {
	
	public static void main(String[] args) {
		
		Display display = new Display();
		Display display1 = new Display();
		Display display2 = new Display();
		
		DisplayThread t1 = new DisplayThread(display,"HELLO");
		DisplayThread t2 = new DisplayThread(display1,"HIII");
		DisplayThread t3 = new DisplayThread(display2,"WORLD");
		
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
