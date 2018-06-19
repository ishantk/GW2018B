package com.auribises;

/*
 * 	Throwable
 * 		Error
 * 			StackOverflowError
 * 			..
 * 			...
 * 		Exception
 * 			RuntimeException 					UNCHECKED EXCEPTION
 * 				ArithmeticException
 * 				NullPOinterException
 * 				IllegalStateException
 * 				ArrayIndexOutOfBoundsException
 * 				..
 * 				...
 * 			IOException							CHECKED EXCEPTIONS
 * 				FileNotException
 * 				..
 * 				...
 * 			SQLException
 * 			..
 * 			...
 * 		
 * 		try,catch,finally
 * 
 * try{
 * 
 * }catch(){
 * 
 * }
 * 
 * 
 * try{
 * 
 * }finally{
 * 
 * }
 * 
 * try{
 * 
 * 	try{
 * 
 * 	}catch(){
 * 
 * 	}finally{
 * 
 * 	}
 * 
 * }catch(){
 * 
 * }finally{
 * 
 * }
 * 
 */

public class ExcDemo {

	public static void main(String[] args) {
		
		System.out.println("==Main Started==");
		
		int a = 10, b = 0, c = 0;
		int[] arr = {10,20,30,40,50};
		
		try{
			c = a/b;
			System.out.println("arr[3] is: "+arr[3]);
			
		}/*catch(ArithmeticException aRef){
			System.out.println("Something Went Wrong !!"+aRef);
		}catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Something Went Wrong !!"+aRef);
		}*/catch(Exception e){
			System.out.println("Something Went Wrong !!"+e);
			//e.printStackTrace(); | Debugging
		}finally{
			System.out.println("This is Awesome");
		}
		
		System.out.println("c is: "+c);
		
		System.out.println("==Main Finished==");
	}

}
