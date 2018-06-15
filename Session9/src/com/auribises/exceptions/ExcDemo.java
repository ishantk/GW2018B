package com.auribises.exceptions;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("==Main Started===");
		
		int[] arr = {10,20,30,40,50};
		try{
			System.out.println("arr[30] is: "+arr[30]);
		}catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Something went wrong !! "+aRef);
		}
		
		System.out.println("==Main Finished===");
	}

}
