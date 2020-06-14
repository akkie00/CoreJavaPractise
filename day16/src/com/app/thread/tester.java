package com.app.thread;

public class tester {

	//Use throws as the main/static method isn't overrding and "throws" can be used here
	public static void main(String[] args) throws InterruptedException {

//		System.out.println(Thread.currentThread());
		
		MyThread t1 = new MyThread("first");
		MyThread t2 = new MyThread("second");
		MyThread t3 = new MyThread("third");
		MyThread t4 = new MyThread("fourth");

		for(int i=0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName()+" execute "+i);
			Thread.sleep(100);
			if (i==9) {
				System.out.println("lst main");
			}
		}
		System.out.println("completed Main's exec");
		System.out.println("waiting for childs to finish execution..");
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("completed Main");

	}
	}
