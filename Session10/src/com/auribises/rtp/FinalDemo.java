package com.auribises.rtp;

// final class cannot be extended
final class Parent{
	// final method cannot be overridden
	final void show(){
		
	}
}

class Child{ //extends Parent{ // error
	// error
	/*void show(){
		
	}*/
}

public class FinalDemo {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100;
		
		// Final Variable
		final int j = 10;
		//j = 100; error

		// Blank Final Variable
		final int k;
		k = 10;
		
		//k = 100; error
		
	}

}
