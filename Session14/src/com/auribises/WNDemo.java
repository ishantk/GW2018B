package com.auribises;

class Message{
	
	String data;
	
	Message(){
		data = "No Message Available";
	}
	
	void writeMessage(String data){
		this.data = data;
		System.out.println("==Message Written==");
	}
	
	void readMessage(){
		System.out.println("Message is: "+data);
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			
			try {
				mRef.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
	
}

class WriterThread extends Thread{
	
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	public void run() {
		synchronized (mRef) {
			mRef.writeMessage("Search the candle rather than cursing the darkness !!");
			
			//mRef.notify();
			mRef.notifyAll();
		}
	}
	
}

public class WNDemo {

	public static void main(String[] args) {
		
		Message mRef = new Message();
		/*mRef.readMessage();
		mRef.writeMessage("Be Exceptional !!");
		mRef.readMessage();*/
		
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt = new WriterThread(mRef);
		
		rt1.start();
		rt2.start();
		wt.start();

	}

}
