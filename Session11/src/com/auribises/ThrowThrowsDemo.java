package com.auribises;

import java.io.IOException;


//User-Defined UNCHECKED Exception
class MyBankingException extends RuntimeException{
	public MyBankingException(String message) {
		super(message);
	}
}

// User-Defined CHECKED Exception
class YourBankingException extends Exception{
	public YourBankingException(String message) {
		super(message);
	}
}


class Banking{
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		
		balance = balance - amt;
		
		if(balance <= minBal){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdawl Failure!! Balance is LOW \u20b9"+balance);
		}else{
			System.out.println("Withdawl Success and Balance is \u20b9"+balance);
		}
		
		if(attempts == 3){
			// UNCHECKED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts !! Balance is LOW");
		//	throw aRef;
			
			MyBankingException mRef = new MyBankingException("Illegal Attempts !! Balance is LOW");
			throw mRef;
		}
	}
	
	void withdrawAgain(int amt) throws IOException,YourBankingException {
		
		balance = balance - amt;
		
		if(balance <= minBal){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdawl Failure!! Balance is LOW \u20b9"+balance);
		}else{
			System.out.println("Withdawl Success and Balance is \u20b9"+balance);
		}
		
		if(attempts == 3){
			// CHECKED EXCEPTION
			//IOException iRef = new IOException("Illegal Attempts !! Balance is LOW");
			//throw iRef;
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts !! Balance is LOW");
			throw yRef;
		}
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
		System.out.println("==Banking Started==");
		
		Banking bRef = new Banking();
		
		/*for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			System.out.println("Exception: "+e);
		}
		
		System.out.println("==Banking Finished==");

	}

}
