
public class Arrays {

	public static void main(String[] args) {
		
		// Single Value Containers
		int popLdh = 2340;
		int popJal = 4567;
		int popAsr = 3468;
		//.
		//...
		
		int pop = popLdh+popJal+popAsr;
		
		int[] popArr = {2340,4567,3468,567,1345,2435};
		
		System.out.println("popLdh is: "+popLdh); // 2340
		System.out.println("popArr is: "+popArr); // Address
		
		// popArr is a Reference Variable which is holding the address of an Array
		// popArr can only store integers (Homogeneous)
		
		System.out.println("popArr length is: "+popArr.length);

		// Read Elements
		System.out.println(popArr[3]);
		
		System.out.println("==========");
		
		// Read All Elements
		
		int count = 0;
		for(int i=0;i<popArr.length;i++){
			System.out.println(popArr[i]);
			count = count + popArr[i];
		}
		
		System.out.println("Population is: "+count);
		
		int[] a1 = {123,3456,2311,6764,235,6753};
		int[] a2 = {567,3456,567,789,235,3456};
		
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		System.out.println("a2 is: "+a2+" and length is: "+a1.length);
		
		int[] a3 = a1; // Reference Copy
		System.out.println("a3 is: "+a3+" and length is: "+a3.length);
		
		a1[2] = 200;
		
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+"  ");
		}
		System.out.println("==========");
		for(int i=0;i<a3.length;i++){
			System.out.print(a3[i]+"  ");
		}

	}
	

}
