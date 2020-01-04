package Basics;

 
class Test 
{ 
	static int arr[] = {8, 16, 4, 32, 64}; 
	
	  
	static int largest() 
	{ 
		int i; 
		
		  
		int max = arr[0]; 
		
		 
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		
		return max; 
	} 
	
	 
	public static void main(String[] args) 
	{ 
		System.out.println("Largest in given array is " + largest()); 
		} 
} 

