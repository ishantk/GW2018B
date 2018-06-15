/*
 * Why Programming Languages ?
	To develop a Software which will solve a problem

	Software
		System Software
			C/C++
		Application Software
			Apps | Java or C++ or Python

			Java -> App -> Android

	Problem

		Uber/OLA

			MODEL
			Data
				source
				destintion
				typeOfCab
				payMethod

			VIEW
				UI
					Where user will give inputs
					where we show output to user	

			CONTROLLER
				Logic
					Shortest path
					Least Traffic
					Least Time


			Model -> View -> Controller
			

			Java
				PL 

				JDK Install	
					Java Development Kit
					Contains API's (Application Programming Interfaces)

				JDK Path Setup
					Google

				Eclipse Install
					Software which we will use for programming


			How to Code Hello World in Java	
			
			Oranges ->Juicer ->	Juice
			Code -> Compiler -> Binary	

 */

class Five{
	
	// Function or Method -> non static
	void fun(int a, int b, int c){
		int num3 = a+b+c;
		System.out.println("num3 is: "+num3);
	}

	// Function or Method -> static
	static void fun1(int num1, int num2){
		int num3 = num1+num2;
		System.out.println("num3 is: "+num3);
	}
}

public class One {

	public static void main(String[] args) {
		
		Five.fun1(10,20);
		Five.fun1(30,40);
		Five.fun1(50,60);
		Five.fun1(70,80);
		
		Five fRef = new Five(); // Object Construction (fRef is a ref variable)
		fRef.fun(10,20,30);
		
	}

}

class Two{
	
}

class Three{
	class Four{
		
	}
}