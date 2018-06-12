
public class BlockDemo {

	static int i;
	
	BlockDemo(){
		//i = 10; // Not a good practice
		System.out.println("This is BlockDemo");
	}
	
	// Block or Initializer Block
	{
		System.out.println("This is a Block");
	}
	
	static{
		i = 10; // OK
		System.out.println("This is a static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");

		BlockDemo bRef1 = new BlockDemo();
		
		System.out.println(BlockDemo.i);
		
		BlockDemo.i = 100; // Assuming that some operation made the value as 100
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
		
		BlockDemo bRef2 = new BlockDemo();
		
		System.out.println(BlockDemo.i);
		
		System.out.println("Main Finished");
		
	}

}
