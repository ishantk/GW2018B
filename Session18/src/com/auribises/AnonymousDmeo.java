package com.auribises;

interface Inf{
	void show();
}

class CA implements Inf{

	public void show() {
		System.out.println("This is show");
	}
	
}

public class AnonymousDmeo {

	public static void main(String[] args) {
		
		//Inf iRef = new CA();
		//iRef.show();
		
		// Anonymous Class : Class has no name
		// An Object will be created for Anonymous class whose reference is available in iRef
		Inf iRef = new Inf(){
			
			{
				// Initialization block cab be created but not Constructors
			}
			
			public void show() {
				System.out.println("This is show");
			}
			
		};

		iRef.show();
	}

}
