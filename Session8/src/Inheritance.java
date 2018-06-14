class A{
	A(){
		System.out.println("A Object Constructed");
	}
	
	A(int i){
		System.out.println("A Object Constructed and i is: "+i);
	}
}

class B extends A{
	B(){
		super(10); // should be the first statement
		//super();
		System.out.println("B Object Constructed");
	}
}

class C extends B{
	C(){
		System.out.println("C Object Constructed");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		C cRef = new C();

	}

}
