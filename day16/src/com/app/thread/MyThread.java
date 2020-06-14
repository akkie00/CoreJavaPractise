package com.app.thread;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name); // Thread(String name) named thread
		start(); // Thread's inherited API, runnable
	}

	@Override
	public void run() {
		System.out.println("Started " + getName());
		//added try/catch because overriding methods cannot be added by checked exceptions
		try {
			// BL for exceution logic of threads
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " run " + i);

				sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(getName() + " thread error" + e);
		}
		System.out.println("completed " + getName());
	}

}
