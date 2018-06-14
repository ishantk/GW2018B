import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);

		/*System.out.println("Enter Number a");
		int a = scanner.nextInt();
		
		System.out.println("Enter Number b");
		int b = scanner.nextInt();
		
		int c = a+b;
		System.out.println("Sum is: "+c);*/
		
		System.out.println("==========Welcome to McDonalds==========");
		System.out.println("1. Buy Aaloo Tikki Burger");
		System.out.println("2. Buy Mc. Veggie Burger");
		//..
		//..
		System.out.println("========Enter Your Choice:=============");
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("Thank you for buying Aaloo Tikki");
				break;
	
			case 2:
				
				break;
		}

	}

}
