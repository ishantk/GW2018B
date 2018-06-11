class Counter{
	// Default Value is 0
	int count;
	static int sCount;
	
	void incrementCount(){
		count++;
		sCount++; // Property of Object can Access the Property of Class
	}
	
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("sCount is: "+sCount);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
		
		c1.incrementCount();
		c2.incrementCount();
		c2.incrementCount();
		
		c3.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
						// count		sCount
		c1.showCount(); // 2,5,6    4,5,9
		c2.showCount(); // 4,3 		9,11,7
		c3.showCount(); // 5,3      ?,9,3  
	}

}
