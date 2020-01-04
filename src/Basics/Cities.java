package Basics;

public class Cities {
	public static void main(String[] args){
		// declare and define array 
		String[] cities= {"addis","Nazret","Jigjiga","Harar","Alamaya"};
		System.out.println(cities[3]);
		
	// another way of declaring array
		String[] states = new String[5];
		states[0]= "vegas";
	    states[1]= "kiyas";	
	    states[2]= "monte";
	    states[3]= "kidane";
	    states[4]= "keyafer";
	    System.out.println(states[4]);
	    System.out.println("****************************");
	    
	    
	  // Declare array 
	    //String[] countries;
	    
	   // define array 
	    
	    //countries = new String[3];
	    
	    //countries[0] = "Ethiopia";
	    //countries[1] = "Etrtira";
	    //countries[2] = "Sudan";
	    //System.out.println(countries[0]);
	    
	    // do loop enter the loop then test the condition 
	    
	    int i=0;
	    
	    do {
	    	System.out.println(" state :" + states[i]);
	    	i++;
	    }while (i<5);
	    
	    System.out.println("\n while loop");
	    
	    // while loop test the condition first then enters loop
	    int n=0;
	    
	    boolean stateisfound = false;
	    while(!stateisfound){
	    	String state = states[n];
	    	System.out.println(state);
	    	if (state == "kiyas"){
	    		System.out.println("state found!");
	    		stateisfound = true;
	    		
	    	} n++;
	    	
	    	
	    	System.out.println(" \n for loop **************************");
	    	
	    	for(int y=0; y<5;y++){
	    		System.out.println(states[y]);
	    	}
	    }
	    
	}
	
	
	

}
