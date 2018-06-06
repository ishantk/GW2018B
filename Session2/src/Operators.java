
public class Operators {

	public static void main(String[] args) {
		// Code here
		
		// Write Operation
		int a = 10; 	  // 32 bit storage container
		short s = 10; // 16 bit storage container
		
		// Read Operation
		System.out.println("a is: "+a);
		System.out.println("s is: "+s);
		
		// Arithmetic Operators
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+num3);
		
		// + ,-, *, /, %
		
		int x = 10;
		int y = 3;
		
		int z = x % y;
		System.out.println("z is: "+z);
		
		// Assignment Operators
		// =, +=, -=, *=, /=, %=
		x += 5; // x = x+5;
		System.out.println("x is: "+x);
		
		x %= 2; // x = x % 2;
		System.out.println("x now is: "+x);
		
		// Increment/Decrement ++ and --
		x++;  // x = x+1
		++x;  // x = x+1
		x++;
		--x;
		x--;
		System.out.println("x is: "+x);
		
		int p = x++;
		System.out.println("p is: "+p);
		System.out.println("x is: "+x);
		
		// Conditional Operators
		// > , <, >=, <=, ==, !=
		
		x = 130;
		y = 120;
		z = 150;
		
		System.out.println(x != y);
		
		// Logical Operators
		// && !! !
		
		System.out.println( (x>y) && (x>z) );
		System.out.println( (x>y) || (x>z) );
		
		
		System.out.println( !(x>y) );
		
		// Bitwise Operators
		// &, |, ^, <<, >>, >>>
		
		x = 8;  		// 1 0 0 0
		y = 10; 		// 1 0 1 0
		
		z = x & y; 	// 1 0 0 0 // 8
		System.out.println("z is: "+z);
		
		z = x | y;  // 1 0 1 0
		System.out.println("z is: "+z);		
		
		z = x ^ y;  // 0 0 1 0
		System.out.println("z is: "+z);
		
		//z = x >> 2; // 1 0 0 0 -> 0 0 1 0
		x = 12; 
		z = x >> 3; 	 // 1 1 0 0  -> 0 0 0 1
		System.out.println("z is: "+z);
		
		
		x = 8;
		z = x << 2; // 0 0 1 0 0 0 0 0 
		System.out.println("z is: "+z);
		
		
		
		// Sender Side
		int secretSenderKey = 2;
		int data = 12;
		int dataToBeSent = data >> secretSenderKey;
		System.out.println("dataToBeSent: "+dataToBeSent);
		
		
		// Receiver Side
		int secretReceiverKey = 2;
		int dataReceived = 3;
		int dataOriginal = dataReceived << secretReceiverKey;
		System.out.println("dataOriginal: "+dataOriginal);
		
		
		x = -13;
		y = x >> 2;
		System.out.println("y is: "+y);
		/*
		 * 1 0 1 1
		 * 
		 * 0 1 0 0
		 *       1
		 * 0 1 0 1 >> 2
		 * 
		 * 1 1 0 1
		 * 0 0 1 0
		 *       1
		 * 0 0 1 1  > -3            
		 *       
		 */
		
		
	}

}
