package com.app.thread;

public class TaskTester {

	//Use throws as the main/static method isn't overrding and "throws" can be used here
	public static void main(String[] args) throws InterruptedException {

		//creating task2's instance becuase it has to be passed to Task1 
		Task2 tsk2 = new Task2();
		Thread t2 = new Thread(tsk2, "Thread2");

		Thread t1 = new Thread(new Task1(t2), "thread1");
		t1.start();
		
		t2.start();
		
		System.out.println("waitn for child ");
		System.out.println(t1.isAlive()+"= T1"+t2.isAlive()+" = T2");
 
		t1.join();
		t2.join();
		System.out.println(t1.isAlive()+"= T1"+t2.isAlive()+" = T2");
		System.out.println("completed Main");

	}
	}
