
public class StringDemo {

	public static void main(String[] args) {
		
		// Interned String
		String str1 = "Hello";
		String str2 = "Hello";

		// String Objects
		String str3 = new String("HeLlo");
		String str4 = new String("Hello");
		
		System.out.println(str1);
		System.out.println(str3);
		
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		//if(str3.equals(str4)){
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 equals str4");
		}
		
		//if(str3.compareTo(str4) == 0){
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 compared to str4");
		}
		
		// Strings are IMMUTABLE (They cannot be changed)
		String str5 = "John, Jennie, Jim ,Jack, Joe, Jim";
		String str6 = str5.toUpperCase();
		System.out.println("str5 is: "+str5);
		System.out.println("str6 is: "+str6);
		
		// API's on String class
		int idx = str5.indexOf('n');
		idx = str5.lastIndexOf('n');
		idx = str5.indexOf("Jim");
		idx = str5.lastIndexOf("Jim");
		System.out.println("idx is: "+idx);
		
		System.out.println(str5.length());
		
		if(str5.contains("Jim")){
			System.out.println("Jim is in the String");
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")){
			System.out.println("Its a Valid Email");
		}else{
			System.out.println("Its an invalid email");
		}
		
		String website = "www.abc.com";
		if(website.endsWith(".com")){
			
		}
		
		if(website.startsWith("www.")){
			
		}
		
		String songName = "ThisisAwesome.mp3";
		if(songName.endsWith(".mp3")){
			System.out.println("Song is an mp3 song");
		}
		
		String str7 = str5.substring(5,10);//str5.substring(3);
		System.out.println(str7);

		String[] names = str5.split(",");
		for(String name : names){
			System.out.println(name.trim());
		}
		
		char[] chArr = str5.toCharArray();
		for(char ch : chArr){
			System.out.print(ch+"=");
		}
	}

}
