package com.app.thread;

//MyRunnableTask IS NOT a thread.
public class MyRunnableTask  implements Runnable{ 

	
	@Override
	public void run() {
		System.out.println("Started " + Thread.currentThread().getName());
		//added try/catch because overriding methods cannot be added by checked exceptions
		try {
			// BL for exceution logic of threads
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " run " + i);

				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " thread error" + e);
		}
		System.out.println("completed " + Thread.currentThread().getName());
	}

}
