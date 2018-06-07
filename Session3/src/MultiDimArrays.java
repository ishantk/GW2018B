
public class MultiDimArrays {

	public static void main(String[] args) {
		
		// Arrays are not Matrices
		// ARRAY OF ARRAYS /2-D
		int[][] arr = {
						{10,20,30,40,50},			// 0
						{10,20,30,40},				// 1
						{10,20,30,40,50,60,70}      // 2
				  	  };
		
		

		
		System.out.println("arr is: "+arr); 				// Address
		System.out.println("arr size is: "+arr.length); // 3
		
		System.out.println("arr[0] is: "+arr[0]);
		System.out.println("arr[0] size is: "+arr[0].length);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"] is: "+arr[i]);	
		}
		
		System.out.println(arr[0][1]);
		System.out.println(arr[2][2]);
		
		// ARRAY OF ARRAY OF ARRAYS / 3-D
		int[][][] arrr = {
							{
								{10,20,30,40,50},			
								{10,20,30,40},				
								{10,20,30,40,50,60,70}
							},
							{
								{10,20,30,40,50},			
								{10,20,30,40},				
								{10,20,30,40,50,60,70}
							}
					  	  };
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("****************");
		
		for(int i=0;i<arrr.length;i++){
			for(int j=0;j<arrr[i].length;j++){
				for(int k=0;k<arrr[i][j].length;k++){
					System.out.print(arrr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("****************");
		
		System.out.println(arrr.length);
		System.out.println(arrr[0].length);
		System.out.println(arrr[0][1][2]);

		
	}

}
