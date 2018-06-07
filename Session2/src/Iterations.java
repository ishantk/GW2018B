
public class Iterations {

	public static void main(String[] args) {
		
		int num = 5;
		int i = 1;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		i = 100;
		System.out.println("=====while loop=====");
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		
		num = 7;
		i = 100;
		System.out.println("=====do while loop=====");
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;	
		}while(i<=10);
		
		
		System.out.println("=====for loop=====");
		//for(i=1,num=9;i<=10;i++){
			//System.out.println(num+" "+i+"'s are "+(num*i));
		//}
		
		num = 9;
		for(int j=1;j<=10;j++){
			System.out.println(num+" "+j+"'s are "+(num*j));
		}
		
		int myNum = 8;
		// Write Your Logic -> 1 0 0 0 as output
	}

}
