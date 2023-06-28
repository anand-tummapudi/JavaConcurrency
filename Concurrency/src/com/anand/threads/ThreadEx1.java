package com.anand.threads;

public class ThreadEx1 {
	
	public static class Mythread extends Thread{
		
		public void run() {
			System.out.println("My Thread Running ...");
			System.out.println("My Thread Finished..");
		}
	}

	public static void main(String[] args) {
		
		// Example by Extending Thread class
		Thread thread = new Thread();  
		thread.start();
		
		Mythread mythread = new Mythread();
		
		mythread.start();
		System.out.println(mythread.getName());
		System.out.println(Thread.currentThread().getName());
		
		// Thread creation by implementing the runnable interface.
		Thread thread2 = new Thread(new Mythread2());
		thread2.start();
	}
	
	public static class Mythread2 implements Runnable{

		@Override
		public void run() {
			System.out.println("Mythread2 Running");
			
		}
		
	}

}
