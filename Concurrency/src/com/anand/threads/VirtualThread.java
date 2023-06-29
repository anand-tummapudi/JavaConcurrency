package com.anand.threads;

public class VirtualThread {

	public static void main(String[] args) {

		// Create Runnable 
		
		Runnable runnable = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("Runnable:"+Thread.currentThread().getName()+"-"+i);
			}
		};
		
		Thread vThread = Thread.ofVirtual().start(runnable);
		// Create but do not start Virtual Thread
		Thread vThread2 = Thread.ofVirtual().unstarted(runnable);
		vThread2.start();
		// How to join a Virtual Thread
		try {
			vThread.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
