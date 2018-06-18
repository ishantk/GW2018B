package com.auribises.rtp;

class A{ // extends Object{
	
}

class B{
	
}

class C{
	
}

class X extends A{
	
}

class P{
	
	public String toString(){
		return "This is Awesome";
	}
	
}

public class ObjectDemo {

	public static void main(String[] args) {
	
		Object oRef;
		oRef = new A();
		oRef = new B();
		oRef = new C();

		P pRef = new P();
		String str = new String("Hello");
		
		System.out.println(pRef);
		System.out.println(pRef.toString());
		
		System.out.println(str);
		
		System.out.println(pRef.getClass());
		System.out.println(pRef.getClass().getName());
		System.out.println(pRef.getClass().getSimpleName());
		
		System.out.println(pRef.hashCode());
		
	}

}
