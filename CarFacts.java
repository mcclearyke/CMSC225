/***************************
* Project 4 - Car Fact Data
****************************
* This project will determine a number of different facts about cars given some input data about various cars from a file.
*____________________________
* Kendall McCleary
* March 11th, 2019
* CMSC 255 Section 003
*****/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CarFacts {
 
 public static void printHeading() {
  System.out.println("Kendall McCleary");
  System.out.println("Project 4 - Car Fact Data");
  System.out.println("This project will determine a number of different facts about cars given some input data about various cars from a file.");
  System.out.println("March 11th, 2019");
  System.out.println("CMSC 255 Section 003");
  System.out.println();
 }
 
 public static void main(String [] args) throws FileNotFoundException {
    printHeading();
    // Calling the method inputData()
    inputData();
}
   
    /// Method inputData()
    	public static void inputData() throws FileNotFoundException {
    		
    		Scanner console = new Scanner(System.in);

    		// Asking the user for the Input file name
      		System.out.print("Input file: ");
      		String inputFileName = console.next();
      		// Asking the user for the Output file name
      		System.out.print("Output file: ");
      		String outputFileName = console.next();

      		File inputFile =  new File(inputFileName);
      		Scanner in = new Scanner(inputFile);
      		PrintWriter out = new PrintWriter(outputFileName);

      		// Values for the IF Statements
      		String bestMileageRatingCar = "";
    		double bestMileageRating = 20.0;
    		String lowestPriceCar = "";
    		double lowestPrice = 15000;
    		String bestOverallValueCar = "";
    		double bestOverallValue = 0;

      		// Begining of the input file
    		System.out.println("Input:");
    		// Begining of the output file
    		out.println("Output:");
    		
    		in.useDelimiter("\t");
    		
    		// Reading the input file
    		while (in.hasNext()) {
    			String makeModel = in.next();
    			int numMiles = in.nextInt();
    			double tankSize = in.nextDouble();
    			double price = in.nextDouble();
    			double drivabilityScore = in.nextDouble();

    			//Calling the method calcMileageRating 
    			calcMileageRating(numMiles, tankSize);
    			double mileageRating; 
    			mileageRating = calcMileageRating(numMiles, tankSize); // returing the mileage rating value

    			// Calling the method calcOverallValue
    			calcOverallValue(mileageRating, price, drivabilityScore);
    			double overallValue; 
    			overallValue = calcOverallValue(mileageRating, price, drivabilityScore); // returing the overall value 

    			// Calling in the method displayData
    			displayData(makeModel, mileageRating, overallValue, out);

    			// Printing out all the inputs
    			System.out.println(makeModel + "\t" + numMiles + "\t" + tankSize + "\t" + price + "\t" + drivabilityScore);	

    				// Finding the best gas mileage rating
    				if (mileageRating < bestMileageRating) {
    					bestMileageRating = mileageRating;
    					bestMileageRatingCar = makeModel;
    				}

    				// Finding the best price
    				if (price < lowestPrice) {
    					lowestPrice = price;
    					lowestPriceCar = makeModel;
    				}

    				// Finding the best overall value
    				if (overallValue > bestOverallValue) {
    					bestOverallValue = overallValue;
    					bestOverallValueCar = makeModel;
    				}
    			}

    	    // Output to the output file
    		out.println("...");
    		out.println();
       		out.print("The car with the best gas mileage rating is " + bestMileageRatingCar + " with a rating of: ");
        	out.printf("%5.2f\n", bestMileageRating);
        	out.println();
        	out.print("The car with the best price is " + lowestPriceCar + " with a price of: $");
        	out.printf("%5.2f\n", lowestPrice);
        	out.println();
        	out.print("The car with the best overall value is " + bestOverallValueCar + " with a rating of: ");
        	out.printf("%5.2f\n", bestOverallValue);

    	// Closing input
    	in.close();
    	// Closing output
    	out.close();

    	}

		// calcMileageRating Method
		public static double calcMileageRating(int numMiles, double tankSize) {
    			
    			// mileageRating equation
    			double mileageRating = numMiles / tankSize;
    			
    			return mileageRating; // return value
    		}

        	// calcOverallValue Method
        	public static double calcOverallValue(double mileageRating, double price, double drivabilityScore) {
    			
    			// overallValue equation
    			double overallValue = 0.35 * mileageRating + 0.4 * price + 0.25 * drivabilityScore;
    			
    			return overallValue; // return value
   			 }

   		// displayData Method
   		public static void displayData(String makeModel, double mileageRating, double overallValue, PrintWriter out) {

   		// Outputting makeModel and mpg and value
    		out.print(makeModel + "\t");
    		out.printf("%5.2f", mileageRating);
    		out.print(" mpg  \t Value:  "); 
    		out.printf("%5.2f", overallValue);
    		out.println();

    	 	}
}
