package com.auribises;

/*class MyTask{
	void executeTask(){
		for (int i=1; i<=10; i++) {
			System.out.println("**MyTask**"+i);
		}
	}
}*/

// MyTask IS A Thread
class MyTask extends Thread{
	public void run(){
		
		System.out.println("MyTask State in run: "+getState());
		
		for (int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("**MyTask**"+i);
		}
	}
}

class A{
	
}

class YourTask extends A implements Runnable{
	public void run(){
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("##YourTask##"+i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		// job1
		System.out.println("==App Started==");

		//MyTask mRef = new MyTask();
		//mRef.executeTask();
		
		MyTask mRef = new MyTask();
		
		System.out.println("MyTask State in main when object is just created: "+mRef.getState());
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r);
		
		mRef.setName("John");
		yRef.setName("Fionna");
		
		Thread.currentThread().setName("Jack");
		
		mRef.setPriority(Thread.MAX_PRIORITY); //10
		yRef.setPriority(Thread.MIN_PRIORITY); //1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);//5
		
		mRef.start();
		// immediately after start method, we will execute join method
		
		try {
			mRef.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		yRef.start();
		// start method will internally call the run method
		// why so? because threads they have states
		
		mRef.yield();
		
		// job2
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("==main=="+i);
		}
		
		// job3
		System.out.println("==App Finished==");
		
		System.out.println("mRef name is: "+mRef.getName()+" and priority is: "+mRef.getPriority());
		System.out.println("yRef name is: "+yRef.getName()+" and priority is: "+yRef.getPriority());
		System.out.println("main name is: "+Thread.currentThread().getName()+" and priority is: "+Thread.currentThread().getPriority());
		
		System.out.println("MyTask State in the end: "+mRef.getState());
	}

}
