package com.auribises.rtp;

/*class Cab{
	Cab(){
		System.out.println("Cab Object Constructed..");
	}
	
	void bookCab(){
		System.out.println("Cab Booked..");
	}
}*/

// Which cannot have Objects
/*abstract class Cab{
	Cab(){
		System.out.println("Cab Object Constructed..");
	}
	
	// which has no definition
	// is a rule or protocol by parent
	abstract void bookCab();
	
	void fun(){
		System.out.println("This is fun");
	}
}*/

interface Cab{
	// error -> interfaces cannot have objects. neither we nor RTE can create the object
	/*Cab(){
		System.out.println("Cab Object Constructed..");
	}*/
	
	// which has no definition
	// is a rule or protocol by parent
	void bookCab(); // -> public abstract void bookCab(); 
	
	// error
	/*void fun(){
		System.out.println("This is fun");
	}*/
}

class MicroCab implements Cab{//extends Cab{ // IS-A Relation
	MicroCab(){
		System.out.println("MicroCab Object Constructed..");
	}
	
	public void bookCab(){
		System.out.println("Micro Cab Booked..");
	}
}

class MiniCab implements Cab{//extends Cab{ // IS-A Relation
	MiniCab(){
		System.out.println("MiniCab Object Constructed..");
	}
	
	public void bookCab(){
		System.out.println("Mini Cab Booked..");
	}
}

class LuxuryCab implements Cab{//extends Cab{ // IS-A Relation
	LuxuryCab(){
		System.out.println("LuxuryCab Object Constructed..");
	}
	
	public void bookCab(){
		System.out.println("Luxury Cab Booked..");
	}
}

public class RTPDemo {

	public static void main(String[] args) {
	
		/*Cab cRef;
		cRef = new Cab();
		cRef.bookCab();*/
		
		/*MicroCab mRef;
		mRef = new MicroCab();
		mRef.bookCab();*/
		
		
		// Parent's Ref Var can point to the object of Child
		// Ref Variable of Interface can point to the Object which implements it
		Cab cRef;
		cRef = new MicroCab(); // Polymorphic Statement
		cRef.bookCab();
		
		System.out.println("###################");
		
		cRef = new MiniCab();
		cRef.bookCab();
		
		System.out.println("###################");	
		
		cRef = new LuxuryCab();
		cRef.bookCab();
		
		// cannot be instantiated
		//cRef = new Cab(); // Is it Required ? 
		
			
	}

}







