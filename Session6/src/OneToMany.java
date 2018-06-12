class Employee{
	String name;
	String designation;
	int salary;
	
	
	Project[] projects; // HAS-A Relation | 1 to many
	
	void showEmployee(){
		System.out.println(name+" with designation "+designation+" works on below projects");
		
		/*for(int i=0;i<projects.length;i++){
			projects[i].showProject();
		}*/
		
		// Enhanced For Loop
		for(Project p : projects){
			p.showProject();
		}
	}
}

class Project{
	
	String title;
	int duration;
	String technology;
	
	Project(String title, int duration, String technology){
		this.title = title;
		this.duration = duration;
		this.technology = technology;
	}
	
	Project(){
		
	}
	
	void showProject(){
		System.out.println(title+" is developed in "+technology+" will be completed in "+duration+" months");
	}
}
public class OneToMany {

	public static void main(String[] args) {
		
		Project[] projects = new Project[3];
		projects[0] = new Project("ABC",2,"Android");
		projects[1] = new Project("PQR",5,"AWS");
		projects[2] = new Project("XYZ",1,"Firebase");
		
		Employee emp = new Employee();
		emp.name = "John";
		emp.designation = "Software Engr";
		emp.salary = 30000;
		emp.projects = projects; // Reference Copy
		
		emp.showEmployee();

	}

}
