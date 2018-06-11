// Describing the Object User
class User{
	
	// Attributes | These belongs to Object and not to the Class
	String name;
	private String phone;
	String email;
	byte age;
	char gender;
	String address;
	
	// Attribute | Belongs to Class
	static String company;
	
	// Methods - Non Static | They belong to Object
	// 1. Setter Method -> To Write the data in Object
	void setPhone(String p){
		if(!p.isEmpty() && !(p.length()<=12)){
			phone = p;
		}else{
			phone = "NA";
		}
	}
	
	//2. Getter Method -> To Read the data from Object
	String getPhone(){
		return phone;
	}
	
	// Property of Class
	static void showCompany(){
		System.out.println("Comapny Name is: "+company);
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		int i = 10;
		int j = i; // Value Copy
		
		// Object Construction Statement
		User uRef1 = new User();
		User uRef2 = new User();
		User uRef3 = uRef1; // Reference Copy
		
		// uRef1 and uRef2 are the reference variables which holds the address of Objects
		// Objects are created in the Heap i.e. dynamically i.e. at run time by new
		
		System.out.println("i is: "+i);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);

		// Write Operation - Writing data in Object
		uRef1.name = "John Watson";
		//uRef3.phone = "+91 99999 88888";
		uRef3.setPhone("+91 99999 88888");
		uRef1.email = "john@example.com";
		uRef1.age = 20;
		uRef1.gender = 'M';
		uRef1.address = "Redwood Shores";
		
		uRef2.name = "Jennie Watson";
		//uRef2.phone = "+91 99999 77777";
		uRef2.setPhone("+91 99999 77777");
		uRef2.email = "jennie@example.com";
		uRef2.age = 30;
		uRef2.gender = 'F';
		uRef2.address = "Country Homes";
		
		// Read Operation - Reading the data from Object
		//System.out.println(uRef1.name+" can be contacted at "+uRef3.phone+" and lives in "+uRef1.address);
		//System.out.println(uRef2.name+" can be contacted at "+uRef2.phone+" and lives in "+uRef2.address);
		
		System.out.println(uRef1.name+" can be contacted at "+uRef3.getPhone()+" and lives in "+uRef1.address);
		System.out.println(uRef2.name+" can be contacted at "+uRef2.getPhone()+" and lives in "+uRef2.address);
		
		User.company = "Auribises";
		User.showCompany();
		
	}

}
