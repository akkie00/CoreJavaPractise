package com.app.thread;

//MyRunnableTask IS NOT a thread.
public class Task1  implements Runnable{ 

	private Thread t2;
	public Task1(Thread t2) {
		this.t2 = t2;
	}
	
	@Override
	public void run() {
		System.out.println("Started " + Thread.currentThread().getName());
		//added try/catch because overriding methods cannot be added by checked exceptions
		try {
			// BL for exceution logic of threads
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " executing some BL in " + i);
				
				Thread.sleep(500);
				t2.join();
				
				System.out.println(Thread.currentThread().getName()+"continuing execution after t2's death");
				System.out.println(t2.isAlive()+" T2's state");

			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " thread error" + e);
		}
		System.out.println("completed " + Thread.currentThread().getName());
//		System.out.println(t2.isAlive()+" T2's state");
	}

}
