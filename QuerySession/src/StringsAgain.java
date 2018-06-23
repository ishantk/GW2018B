
public class StringsAgain {

	public static void main(String[] args) {
		
		
		String str = new String("Hello");
		str.concat(" World");
		
		// Strings are IMMUTABLE
		System.out.println(str);

		// MUTABLE Strings. Cannot be used in Interened way
		// THREAD-SAFE
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		
		// NOT THREAD-SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		System.out.println(buffer);
		System.out.println(builder);
		
		int[] arr = {10,20,30,40,50};
		/*for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
		int sum = 0;
		for(int elm : arr){
			System.out.println(elm);
			sum += elm;
		}
		
		System.out.println("sum is: "+sum);
		
	}

}
