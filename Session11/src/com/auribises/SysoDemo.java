package com.auribises;

class SSystem{
	static PPrintStream oout = new PPrintStream();
}

class PPrintStream{
	
	void pprintln(String msg){
		System.out.println(msg);
	}
}

public class SysoDemo {

	public static void main(String[] args) {
			
		SSystem.oout.pprintln("This is Awesome");
		
	}

}
