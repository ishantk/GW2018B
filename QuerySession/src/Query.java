class Employee{
	
	// property of object
	String name;
	
	// property of class
	static String companyName;
	
	void show(){
		
	}
	
	static void hello(){
		
	}
	 
}

class A{
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}



public class Query {

	public static void main(String[] args) {
		
		A aref = new A();
		aref.setA(10);
		System.out.println(aref.getA());
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name = "John";
		e2.name = "Jennie";
		
		Employee.companyName = "ABC Group";
		
		e2.companyName = "XYZ Group";
		
		System.out.println(e1.name+" and companyName "+e1.companyName);
		System.out.println(e2.name+" and companyName "+e2.companyName);
		System.out.println(Employee.companyName);
		

	}

}
