package Basics;

public class Salarycalulator {
	public static void main(String[] args){
		// lets define a variable to define our carrier 
		
		// declare a variable 
		
		String career;
		System.out.println("Program is starting");
		
		//  define variable 
		career ="Software Developer";
		System.out.println("My career: " + career);
		
		// Declare and define 
		
		int hoursperweek = 40;
		int weeeksperyear= 35;
		double rate = 4.50;
		career = "web developer";
		
		double salary = hoursperweek*weeeksperyear*rate;
		System.out.println("My salary as a " + career+ " at the rate of $" + rate +" per hour is $ "+"per year $" + salary);
		
		
	}

}
