package Basics;

public class Favonachi {
	public static void main (String[] args){
		// fibonachi is defined as the sum of two previous value
		//fib(0)=0
		//fib(1)=1
		//fib(2)=1
		//fib(3)=fib(1)+fib(2)=1+1=2
		//fib(4)=fib(3)+fib(2)=2+1=3
		//fib(5)=fib(4)+fib(3)=2+3=5
		System.out.println(fib(5));
		System.out.println("**************");
		System.out.println(fact(6));
		
		// factorial 1!=1
		//2!=2
		//3!=3*2*1=6
		//4!=4*3*2*1=24
		
	}
	public static int fib(int n){
		
		if (n == 0){
			return 0;
				}
		else if (n ==1)
		{ 
			return 1;
		}
		
		return ((fib(n-1))+fib((n-2)));
		
	}
	
	public static int fact(int f){
		if (f == 0){
			return 1;
				}
		else  
		{ 
			 return((f)*(fact(f-1)));
		}
	}
}
