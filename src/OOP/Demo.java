package OOP;

class person{
	
	String name;
	String eat;
	String sleep;
	
	// every person activity 
	
	void walk(){
		System.out.println( name + " is walking");
		
	}
	
	void eat(){
		System.out.println( eat + " is eating");
		
	}
	void sleep(){
		System.out.println( sleep + " is sleeping");
		
	}
}

public class Demo { 
	
	 
		 public static void main (String[] args){
			 // Instantiation an object 
			 person person1 = new person();
			 
			 // define some properties  
			 person1.name ="joe";
			 person1.eat ="bread";
			 person1.sleep ="on matress";
			 
			 // Abstraction // get or extract the information that we want  or only what we want e.g walk only 
			 person1.eat();
			 person1.sleep();
			 person1.walk();
			 
		 }
		
	

}
