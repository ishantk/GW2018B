
public class MoreArrays {

	public static void main(String[] args) {
		
		int x = 10;
		
		// Implict Way -> int[] a1 = new int[]{10,20,30,40,50};
		int[] a1 = {10,20,30,40,50};

		
		// Explicit Way
		int[] a2 = new int[]{10,20,30,40,50};
		
		// new is an operator which creates the array(multi value container) in the Heap
		// array is created dynamically (at run time)
		
		int a3[] = {10,20,30,40,50};
		int a4[] = new int[]{10,20,30,40,50,60,70,80,90,100};
		
		a4[3] = 1000;
		
		// Enhanced For Loop
		for(int n : a4){
			System.out.println(n);
		}
		
		System.out.println("====");
		
		int[] a5 = new int[5];
		a5[0] = 10;
		a5[2] = 100;
		
		for(int n : a5){
			System.out.println(n);
		}
		
		int a6[] = new int[10];
		
		int a7[],a8;
		a7 = new int[5];
		a8 = 100;
		
		int[] a9,a10;
		a9 = new int[5];
		a10 = new int[10];
	}

}
