class Father{
	public void purchaseBike(){
		System.out.println("Lets buy Pulsar !!");
	}
}


class Son extends Father{
	public void purchaseBike(){
		System.out.println("Lets buy Royal Enfield !!");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Son sRef = new Son();
		sRef.purchaseBike();
		
	}

}
