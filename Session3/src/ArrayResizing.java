
public class ArrayResizing {

	public static void main(String[] args) {
		
		// ARRAYS CANNOT BE RESIZED
		
		int[] a1 = new int[]{10,20,30,40,50};
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		
		for(int num : a1){
			System.out.print(num+"  ");
		}
		
		System.out.println();
		
		int[] temp = a1; // Reference Copy

		a1 = new int[10];
		
		System.arraycopy(temp, 0, a1, 0, temp.length);
		
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		for(int num : a1){
			System.out.print(num+"  ");
		}
		
		
	}

}
