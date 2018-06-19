package com.auribises;

class Outer{
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Helper Design Pattern
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
}

class CA{
	
	private class CB{
		
	}
	
	public class CC{
		
	}
	
	static class CD{
		
	}
	
	interface Inf1{
		
	}
	
	static interface Inf2{
		
	}
	
	void fun(){
		// Local Classes
		class Fun{
			
		}
		
		Fun fRef = new Fun();
	}
	
	static void sFun(){
		class SFun{
			
		}
	}
	
}

public class NestedDemo {

	public static void main(String[] args) {
		Outer oRef = new Outer();
		oRef.show();
		
		// Containment
		Outer.Inner iRef = oRef.new Inner();
		//Outer.Inner iRef1 = oRef.new Inner();
		iRef.show();
	}

}
