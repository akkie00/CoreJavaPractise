package com.app.thread;

public class tester {

	//Use throws as the main/static method isn't overrding and "throws" can be used here
	public static void main(String[] args) throws InterruptedException {

//		System.out.println(Thread.currentThread());
		
		MyRunnableTask runTaskInst = new MyRunnableTask();
		Thread t1 = new Thread(runTaskInst);
		Thread t2 = new Thread(runTaskInst);
//		Thread t3 = new Thread(runTaskInst);
		t1.start();t2.start();
//		t3.start();
		
		for(int i=0; i< 5; i++) {
			System.out.println(Thread.currentThread().getName()+" execute "+i);
			Thread.sleep(100);
//			if (i==9) {
//				System.out.println("lst main");
//			}
		}
//		System.out.println("completed Main's exec");
		System.out.println("waiting for childs to finish execution..");
		t1.join();
		t2.join();
//		t3.join();
		System.out.println("completed Main");

	}
	}
