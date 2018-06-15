package com.auribises.packone;

public class One {


	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

class CA extends One{
	
}

class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

// In one source file we will have only one public class
// Because in java, name of the source file should be same as that of public class
/*public class Three{
	
}*/

// private class not allowed
/*private class Four{
	
}*/

//protected class not allowed
/*protected class Five{
	
}*/

class Six{
	
	// Nested Classes can be default, private , protected or public
	private class Seven{
		
	}
	
	protected class Eight{
			
	}
	
	class Nine{
		
	}
	
	public class Ten{
		
	}
	
}





