package com.auribises.rtp;

interface Inf1{
	int i = 10; // public static final int i = 10;
	void fun();
	void show();
}

interface Inf2{
	void fun();
	void hello();
}

interface Inf3 extends Inf1,Inf2{ // Multiple Inheritance | I2I
	
}

class CA implements Inf3{//Inf1,Inf2{ // Multiple Implementation

	public void hello() {
		System.out.println("This is hello");
	}

	public void fun() {
		System.out.println("This is fun");
	}

	public void show() {
		System.out.println("This is show");
	} 

	void bye(){
		System.out.println("This is bye");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		/*Inf1 i1 = new CA();
		i1.show();
		i1.fun();
		//i1.hello(); error
		
		System.out.println("i is: "+Inf1.i);
		
		Inf2 i2 = new CA();
		i2.fun();
		i2.hello();
		//i2.show(); error*/
		
		Inf3 i3 = new CA();
		i3.show();
		i3.hello();
		i3.fun();
		
		// i3.bye(); error
		
		//CA cRef = (CA)i3; // DownCasting
		//cRef.bye();

	}

}
