
public class Strings {

	public static void main(String[] args) {
		
		//char[] chArr = new char[]{'A','P','P','L','E'};
		char[] chArr = {'A','P','P','L','E'};
		System.out.println(chArr); // Value
		System.out.println("chArr is: "+chArr); // Address
		
		// Strings are Reference Types
		// s1, s2, s3 and s4 are reference variables
		
		// Interned Way !!
		String s1 = "Apple";
		String s2 = "APPLE";
		System.out.println("s1 is: "+s1);
		System.out.println(s2);
		
		// Object Way
		String s3 = new String("Apple");
		String s4 = new String("APPLE");
		System.out.println("s3 is: "+s3);
		System.out.println(s4);
		
		// Instead of Address i am seeing the Value
		// toString() method 
		
		if(s1 == s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3){
			System.out.println("s1 == s3");
		}else{
			System.out.println("s1 != s3");
		}
		
		
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1 equals s2");
		}else{
			System.out.println("s1 not equals s2");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
		
		if(s1.equals(s3)){
			System.out.println("s1 equals s3");
		}else{
			System.out.println("s1 not equals s3");
		}
		
		
		if(s1.compareToIgnoreCase(s2)==0){
			System.out.println("s1 compareTo s2");
		}else{
			System.out.println("s1 not compareTo s2");
		}
		
		if(s3.compareTo(s4) == 0){
			System.out.println("s3 compareTo s4");
		}else{
			System.out.println("s3 not compareTo s4");
		}
		
		if(s1.compareTo(s3) == 0){
			System.out.println("s1 compareTo s3");
		}else{
			System.out.println("s1 not compareTo s3");
		}
		
		// Strings are IMMUTABLE
		// They cannot be changed
		String str1 = "John, Jennie, Jim, Jack, Joe";
		String str2 = str1.toUpperCase();
		
		//str1 = str1.toUpperCase();  A BAD Statement to Use
		
		System.out.println("str1 is "+str1);
		System.out.println("str2 is "+str2);
		
		char ch = str1.charAt(0);
		System.out.println("ch is: "+ch);
		
		int len = str1.length();
		System.out.println("len is: "+len);
		
		ch = str1.charAt(27);
		System.out.println("ch is: "+ch);
		
		int idx = str1.lastIndexOf('J');//str1.indexOf('J');
		System.out.println("idx is: "+idx);
		
		idx = str1.indexOf("Jennie");
		System.out.println("idx is: "+idx);
		
		String str3 = str1.substring(6,12);//str1.substring(5);
		System.out.println("str3 is: "+str3);
		
		if(str1.contains("John")){
			System.out.println("John is in the String");
		}
		
		if(str1.endsWith("oe")){ // startsWith
			System.out.println("String ends with oe");
		}
		
		String email = "";
		if(!email.isEmpty()){
			if(email.contains("@") && email.endsWith(".com")){
				System.out.println("Correct Email");
			}else{
				System.out.println("Incorrect Email");
			}
		}else{
			System.out.println("Please Enter Email First !!");
		}
		
		String[] strArr = str1.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		char[] chrs = str1.toCharArray();
		int count = 0;
		for(char c : chrs){
			if(c=='J'){
				count++;
			}
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("J appears "+count+" times");
		
	}

}
