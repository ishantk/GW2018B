
public class DataTypes {

	public static void main(String[] args) {
		
		// Primitive Types
		byte age = 20;
		// age is the name of storage container (box)
		// byte is the type of storage container. you can store integral data in 8 bits
		// 20 is data also known as Literal or Constant
		
		int i = 1000;
		
		int j = 1000;
		
		short s = 50;
		
		long l = 900;
		
		long phone = 9915571177l;
		
		byte b = (byte)128;
		System.out.println("b is: "+b);
		
		int myPhone = (int)l;
		System.out.println("myPhone is: "+myPhone);
		
		double pi = 3.14;
		// 3.14 is a 64bit literal
		
		float g = (float)2.2;
		// 2.2 is a 32 bit literal
		
		char ch = 'A';
		ch = 66; // ASCII Code
		
		ch = '\u20b9'; // UNICODE
		
		ch = '\u0905';
		
		System.out.println("ch is: "+ch);
		
		boolean gps = true;
		gps = false;
		
		// Reference Type
		String str = "This is Awesome";
		System.out.println(str);
	}

}
