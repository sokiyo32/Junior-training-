package Basics;

public class Numberclass {
	public static void main(String[] args)
	{
		System.out.println("program is starting");
		printname();
		int numA =10;
		int numB = 20;
		addnumbers(numA,numB);
		int product = multiplyNumbers(numA,numB);
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	static void printname(){
		System.out.println("My name id Dere");
	}
	static void addnumbers(int numberA, int numberB)
	{
		int sum =numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " sum " + numberB +" is "+ sum);
	}
	static int multiplyNumbers(int valueA, int valueB){
		int product = valueA * valueB;
		/*addNumbers(product,product);*/
		return product;
	}

}
