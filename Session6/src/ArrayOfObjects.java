class Student{
	
	// Attributes
	int roll;
	String name;
	int age;
	
	Student(){
		roll = 0;
		name = "NA";
		age = 0;
	}
	
	Student(int roll, String name, int age){
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	void showStudent(){
		System.out.println(roll+" belongs to "+name +" and is "+age+" years old");
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
	
		/*int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		int a4 = 40;
		int a5 = 50;
		
		int[] arr = {10,20,30,40,50};*/
		
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		Student s1 = new Student(101,"John",30);
		Student s2 = new Student(101,"John",20);
		Student s3 = new Student(101,"John",32);
		Student s4 = new Student(101,"John",36);
		Student s5 = new Student(101,"John",29);
		
		// Array of Refernce Variables -> Array of Objects
		Student[] sArr = new Student[5];
		sArr[0] = new Student(101,"John",30);
		sArr[1] = new Student(102,"Jennie",23);
		sArr[2] = new Student(103,"Jim",33);
		sArr[3] = new Student(104,"Jack",56);
		sArr[4] = new Student(105,"Joe",32);
		
		//System.out.println(sArr[0]);
		
		for(int i=0;i<sArr.length;i++){
			sArr[i].showStudent();
		}
		

	}

}
