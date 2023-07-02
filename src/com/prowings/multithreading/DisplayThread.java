package com.prowings.multithreading;

public class DisplayThread extends Thread {

	Display obj;

	String msg;

	public DisplayThread() {
		super();
	}

	public DisplayThread(Display obj, String msg) {
		super();
		this.obj = obj;
		this.msg = msg;
	}

	@Override
	public void run() {

			obj.print(msg);
//		Display.print(msg);


	}

}
