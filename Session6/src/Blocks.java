
class MyBlock{
	
	static int i;
	
	{
		i = 10;
		System.out.println("MyBlock");
	}
	
	static{
		i = 20;
		System.out.println("MyBlock static");
	}
	
	MyBlock(){
		i = 30;
		System.out.println("MyBlock Constructed");
	}
	
}

public class Blocks {

	public static void main(String[] args) {
		System.out.println("Main Started");

		MyBlock mb1 = new MyBlock();
		
		System.out.println("###############");
		
		MyBlock mb2 = new MyBlock();
		
		System.out.println(MyBlock.i);
		
		System.out.println("Main Finished");
	}

}
