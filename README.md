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