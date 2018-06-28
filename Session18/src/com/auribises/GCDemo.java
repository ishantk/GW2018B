package com.auribises;

class Point{
	int x;
	int y;

	protected void finalize() throws Throwable {
		System.out.println("==Point Object Removed==");
	}
}

// SINGLETON
class Connection{
	
	private static Connection con = new Connection();
	
	private Connection(){
		
	}
	
	public static Connection getConnection(){
		return con;
	}
}

public class GCDemo {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("===============================");
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("===============================");
		
		p1 = null;
		p2 = null;
		
		//rt.gc(); // Call GC to Execute
		System.gc();
		
		System.out.println("===============================");
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("===============================");
		
		// Error
		/*Connection c1 = new Connection();
		Connection c2 = new Connection();
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}

}
