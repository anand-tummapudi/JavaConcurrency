package com.anand.threads;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		
		List<Thread> vThreads = new ArrayList<>();
		int threadCount = 100_000;
		
		for(int i=0;i<threadCount;i++) {
			int vThreadIndex = i;
			
			Thread vThread = Thread.ofVirtual().start(()->{
				int result = 1;
				for(int j=0;j<10;j++) {
					result *= (j+1); 
				}
				
				System.out.println("Result["+vThreadIndex+"]"+result);
			});
			
			vThreads.add(vThread);
		}
		
		for(int i=0;i<vThreads.size();i++) {
			vThreads.get(i).join();
		}
	}

}
