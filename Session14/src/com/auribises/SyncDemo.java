package com.auribises;

class Table{
	//synchronized void printTable(int num){
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void show(){
		System.out.println("This is show");
	}
}

class MyThread extends Thread{
	
	Table tRef;
	
	MyThread(Table t){
		tRef = t;
	}
	
	public void run() {
		
		synchronized (tRef) {
			tRef.printTable(5);
			tRef.show();
		}
		
	}
}

class YourThread extends Thread{
	
	Table tRef;
	
	YourThread(Table t){
		tRef = t;
	}
	
	public void run() {
		synchronized (tRef) {
			tRef.printTable(7);
		}
		
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		Table tRef = new Table();
		//tRef.printTable(5);
		
		MyThread mRef = new MyThread(tRef);
		YourThread yRef = new YourThread(tRef);
		
		mRef.start();
		yRef.start();
		
	}

}
