package Basics;

public class minmaxavg { 
	public static void main(String args[]){
    int array[] = new int[]{22, 16, 32, 25, 102, 220};
 
    // Calling getMax() method for getting max value
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    // Calling getMin() method for getting min value
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
    
    // Calling calcAverage method for getting average value
    double Avg = calcAverage(array);
    System.out.println("Average Value is: "+Avg);
    
  }
 
  // Method for getting the maximum value

  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  	// Method for getting the minimum value
  
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
  
  	//Method for getting the average value
  
   public static double calcAverage(int[] inputArray) {
	  
	   double sum = 0;
	   for (int i=0; i < inputArray.length; i++) {
	        sum = sum + inputArray[i];
	   }
	    
	   double Average = (sum / inputArray.length);
	    
	    
	   return Average;
	}

}
