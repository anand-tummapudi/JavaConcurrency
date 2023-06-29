# Java Concurrency
A thread is nothing but an independent process under execution. In current world, we have multi processor computers where each processor can handle multiple independent threads and we can exeute the systems in parallel.  
#### Java Threads
 - We can create Threads in java in 4 ways 1. Create a class extending with Thread class and override the run() method 2. Creating a class implementing Runnable interface and pass the instance of that class to the constructor. 3. IS an anonimous implementation of runnable which is similar to implementing runnable interface. 4. Is to create a lambda expression which implements runnable interface.
 ```
	\\anonymous example
	Runnable runnable = new Runnable(){
		public void run(){
			System.out.println("Runnable anonymous example");
		}
	};
	
	Thread thread = new Thread(runnable);
	thread.start();
	
	\\ Lambda expression example
	
	Runnable runnable2 = ()->{
		public void run(){
			System.out.println("Lambda expression example");
		}
	};
	
	Thread thread2 = new Thread(runnable2);
	thread2.start();
  ```
  
  - Project **LOOM** is intended to create some light weight threads which are maintained by the program(JVM) not by the operating system.
  - **Virtual Threads** Actual threads in java are called platform threads. Platform thread is executed by operating system thread. A virtual thread is executed by platform thread which is again executed by operating system thread. When a virtual thread is first created, it is not mounted yet to a platform thread. It is internally queued up in the java platform. When a platform thread is ready to execute, it will pick the virtual thread and execute it. The virtual machine keeps couple of virtual threads ready usually it keeps no of threads as your CPU cores. When a virtual thread is waiting for some network response, the platform thread will keep the waiting thread aside in unmounted threads and when the resource is ready, it will move the thered to ready queue again and exeute it.
  - 