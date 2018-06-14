class Person{
	
	String name;
	int age;
	private String phone;
	
	static String companyName;
	
	Person(){
		name = "John Watson";
		age = 30;
		System.out.println("**Person Object Constructed**");
	}
	
	void showPerson(){
		System.out.println("Person Details: "+name+" : "+age);
	}
	
	static void showCompanyName(){
		System.out.println("Company Details: "+companyName);
	}
}

class Employee extends Person{ // IS-A Relation
	
	int salary;
	static String dept;
	
	Employee(){
		System.out.println("##Employee Object Constructed##");
	}
}

public class C2CVsO2O {

	public static void main(String[] args) {
		
		Employee eRef = new Employee();
		eRef.age = 20;
		//eRef.phone = "";  error, private not inherited
		eRef.showPerson();
		
		Employee.companyName = "ABC Group";
		Employee.showCompanyName();
		

	}

}
