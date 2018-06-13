class Address{
	
}

class Project{
	
}

class Employee{
	
	// Attributes
	int eid;
	String name;
	int salary;
	
	Address adrs; 		// HAS-A Relation | 1 to 1
	Project[] projects; // HAS-A Relation | 1 to many
	
	// Constructors
	Employee(){
		eid = 101;
		name = "George Watson";
		salary = 30000;
		System.out.println("^^Employee Object Constructed^^");
	}
	
	Employee(int eid, String name, int salary){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		System.out.println("##Employee Object Constructed##");
	}
	
	void show(){
		System.out.println(eid+" belongs to "+name+" and has a salary of INR "+salary);
	}
}

// IS-A Relation | Generalization
class SoftwareEngr extends Employee{
	SoftwareEngr(){
		System.out.println("@@SoftwareEngr Object Constructed@@");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee();
		Employee emp2 = new Employee(201,"Jennie",40000);
		
		emp1.show();
		emp2.show();*/
		
		SoftwareEngr sRef = new SoftwareEngr();
		sRef.name = "Fionna";
		sRef.show();
		
		//sRef.adrs = ?;
		//sRef.projects = ?

	}

}
