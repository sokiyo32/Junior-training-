package Basics;

public class Wheather {
	public static void main (String[] args){
		// program suggest what to wear
		
		int temprature = 65;
		String suncondition ="Overcast";
		
		if (temprature > 85){
			System.out.println("It's pleasant wear shorts nad t-shirts");
		}
		else if ((temprature > 60) && (suncondition == "Overcast"))
		{
			System.out.println("It's a littel cooler. perhaps wear a long-sleev shirt and jeans");
			System.out.println("wear the hat to keep the sun out of the eye");
		}
		else if ((temprature > 50) || (suncondition == "Overcast"))
		{
			System.out.println("This is a cool day, amke sure to wear warmer clothes.");
			 
		}
		else 
		{
			System.out.println("Looks like a cold day. Bring sweater");
		}
		
		System.out.println("The program is ending");
		
	}

}
