class Person{
	
	// Attributes
	String name;
	String phone;
	String email;
	byte age;
	char gender;
	Address adrs; // adrs is a ref variable | HAS-A Relation | 1 to 1
	
	void showPerson(){
		System.out.println(name+" can be called at "+phone);
		adrs.showAddress();
	}
	
}

class Address{
	// Attributes
	String adrsLine;
	String city;
	String state;
	int zipCode;
	
	void showAddress(){
		System.out.println(adrsLine+" is in "+city);
	}
}


// Complex Object
public class OneToOne {

	public static void main(String[] args) {
		
		Address aRef = new Address();
		aRef.adrsLine = "Country Homes";
		aRef.city = "Bengaluru";
		aRef.state = "Karnataka";
		aRef.zipCode = 520001;
		
		Person pRef = new Person();
		pRef.name = "John";
		pRef.phone = "+91 99999 88888";
		pRef.email = "john@example.com";
		pRef.age = 30;
		pRef.gender ='M';
		pRef.adrs = aRef; // Reference Copy
		
		pRef.showPerson();
		//pRef.adrs.showAddress();
	}

}
