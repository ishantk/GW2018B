package com.auribises;

// Complete the Code
class MyInteger{
	// Code here
}

public class WrapperDemo {

	public static void main(String[] args) {
		// HW
		// MyInteger mRef = new MyInteger(10);
		// int p = mRef.getMyValue();
		
		/*
		 * int 		 Integer
		 * char		 Character
		 * long		 Long
		 * double	 Double
		 * .
		 * .. 	
		 * 
		 */
		
		int i = 10; // Primitive Type | SVC
		
		// Wrapper Class
		// Which can convert the primitive data into an object (ref types)
		Integer iRef = new Integer(i); // Object | MVC
		
		// BOXING | converting the primitive data into an object (ref type)
		
		char ch = 'A';
		Character cRef = new Character(ch);
		
		
		double d = 2.2;
		Double dRef = new Double(d);
		
		// Extract the data back from Object
		// UNBOXING
		int j = iRef.intValue();
		char ch1 = cRef.charValue();
		double e = dRef.doubleValue();
		
		int x = 10;
		Integer xRef = x; // AUTOBOXING -> Integer xRef = new Integer(x);
		int y = xRef;     // AUTOUNBOXING -> int y = xRef.intValue();

	}

}
