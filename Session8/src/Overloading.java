class Maths{

	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(num1+" and "+num2+" addition is: "+num3);
	}
	
	// error
	// Same Name/Signature cannot be created
	/*void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println(num1+" and "+num2+" addition is: "+num3);
	}*/
	
	// error
	/*void addNumbers(int a, int b){
		int c = a + b;
		System.out.println(a+" and "+b+" addition is: "+c);
	}*/
	
	// error
	/*int addNumbers(int a, int b){
		int c = a + b;
		System.out.println(a+" and "+b+" addition is: "+c);
		return c;
	}*/
	
	void addNumbers(double num1, double num2){
		double num3 = num1 + num2;
		System.out.println(num1+" and "+num2+" addition is: "+num3);
	}
	
	// Rules of Overloading
	// 1. Method Name should be same
	// 2. Inputs should be unique i.e. different
	//   2.1 Number of Inputs
	//   2.2 Type of Inputs
	//   2.3 Sequence of Inputs
	// 3. Return Type has no role to play
	
	void fun(){
		System.out.println("This is fun");
	}
	
	void fun(int i){
		System.out.println("This is fun");
	}
	
	void fun(int i, int j){
		System.out.println("This is fun");
	}
	
	void fun(float i, float j){
		System.out.println("This is fun");
	}
	
	void fun(char i, char j){
		System.out.println("This is fun");
	}
	
	void fun(int i, float j){
		System.out.println("This is fun");
	}
	
	void fun(float i, int j){
		System.out.println("This is fun");
	}
	
	
}


public class Overloading {

	public static void main(String[] args) {
		
		Maths mRef = new Maths();
		mRef.addNumbers(100, 200);
		mRef.addNumbers(11, 45);
		mRef.addNumbers(23, 67);
		
		mRef.addNumbers(2.2, 3.3);
		
		mRef.fun();

	}

}
