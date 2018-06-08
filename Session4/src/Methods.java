
public class Methods {

	// Non Static Method
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println("Addition of "+num1+" and "+num2+" is: "+num3);
	}
	
	int addNumbersAgain(int num1, int num2){
		int num3 = num1 + num2;
		return num3;
	}
	
	boolean canVote(int age){
		return (age>=18);
	}
	
	// Static Method
	static void calculateArea(int l, int b){
		int area = l * b;
		System.out.println("Area is: "+area);
	}
	
	public static void main(String[] args) {
		
		// Execute the methods here in main
		// 1. Non Static Methods
		Methods m = new Methods(); // Object Construction Statement
		m.addNumbers(10, 20);
		m.addNumbers(23, 33);
		m.addNumbers(12, 45);
		
		int result = m.addNumbersAgain(12, 12);
		System.out.println("result is: "+result);
		
		if(result%2 == 0){
			System.out.println("Even Number");
		}
		
		int age = 16;
		
		if(m.canVote(age)){
			System.out.println("You Can Vote");
		}else{
			System.out.println("Wait for "+(18-age)+" years");
		}

		Methods.calculateArea(10, 20);
		Methods.calculateArea(12, 30);
		Methods.calculateArea(45, 45);
		
	}

}
