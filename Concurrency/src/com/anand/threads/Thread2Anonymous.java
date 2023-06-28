package com.anand.threads;

public class Thread2Anonymous {

	public static void main(String[] args) {
		
		// Runnable anonymous example
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable Thread example...");
			}
			
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		Runnable runnable2 = () -> {
			System.out.println("Lambda Expression example");
		};
		
		Thread runnableThread = new Thread(runnable2);
		runnableThread.start();
	}

}
