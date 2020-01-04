package Basics;

public class sumonnumbers {
	public static void main (String[] args){
		 
	 System.out.println("The sum of numbers 1 to " +  sum(4));
	 
	 
	
}
	public static int sum(int n){
		int sum =0;
		for(int i =1;i<=n; i++){
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = "+ sum);
			
		} return sum;
			
	}
	
 
}


