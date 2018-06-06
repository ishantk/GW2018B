
public class Conditions {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if(a>b){
			System.out.println("a is greater than b");
		}else{
			System.out.println("b is greater than a");
		}

		boolean isInternetConnected = false;
		boolean isGPSConnected = true;
		
		if(isInternetConnected){
			if(isGPSConnected){
				System.out.println("You can browse Google Maps");
			}else{
				System.out.println("Please Connect to GPS and Try Again !!");
			}
		}else{
			System.out.println("Please Connect to Internet and Try Again !!");
		}
		
		if(isInternetConnected && isGPSConnected){
			System.out.println("You can browse Google Maps");
		}else{
			System.out.println("Please Connect to Internet/GPS and Try Again !!");
		}
		
		int ph = 90;
		int ch = 80;
		int mt = 55;
		
		int avg = (ph+ch+mt)/3;
		
		if(avg>=80){
			System.out.println("OPT MEDICAL "+avg);
		}else if(avg>=70 && avg<80){
			System.out.println("OPT NON MEDICAL");
		}else if(avg>=60 && avg<70){
			System.out.println("OPT COMMERCE");
		}else if(avg>=50 && avg<60){
			System.out.println("OPT ARTS");
		}else{
			System.out.println("Family Business !!");
		}
		
		final int microCab = 101;
		int miniCab = 201;
		int sedanCab = 301;
		int bike = 401;
		int auto = 501;
		
		int userChoice = sedanCab;
		
		// Write Ladder if/else i.e. if elseif else..
		
		
		if(userChoice == microCab){
			System.out.println("Micro Cab booked !! Arriving Soon !!");
		}else if(userChoice == miniCab){
			System.out.println("Mini Cab booked !! Arriving Soon !!");
		}else if(userChoice == sedanCab){
			System.out.println("Sedan Cab booked !! Arriving Soon !!");
		}else if(userChoice == bike){
			System.out.println("Bike booked !! Arriving Soon !!");
		}else if(userChoice == auto){
			System.out.println("Auto booked !! Arriving Soon !!");
		}else{
			System.out.println("Invalid Choice !!");
		}
		
		
		switch (userChoice) {
			case microCab:
				System.out.println("Micro Cab booked !! Arriving Soon !!");
				break;
				
			case 201:
				System.out.println("Mini Cab booked !! Arriving Soon !!");
				break;
				
			case 301:
				System.out.println("Sedan Cab booked !! Arriving Soon !!");
				break;
	
			default:
				System.out.println("Invalid Choice !!");
				break;
		}
				
		
		
		
		
	}

}
