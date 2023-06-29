package com.anand.threads;

public class Thread2Anonymous {

	public static void main(String[] args) {
		
		// Runnable anonymous example
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Runnable Thread example..."+name +"is Running");
			}
			
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		Runnable runnable2 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println("Lambda Expression example:"+name +" IS running");
		};
		
		Thread runnableThread = new Thread(runnable2);
		runnableThread.start();
	}

}
