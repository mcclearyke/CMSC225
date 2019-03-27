/***************************
* Project 5 - College Analysis
****************************
* In this project I will write a program that will accept from the user a text file containing college admissions data along with an output filename.
*____________________________
* Kendall McCleary
* March 25th, 2019
* CMSC 255 Section 003
**********************/
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CollegeAnalysis {

	public static void printHeading() {
		
	    System.out.println("Kendall McCleary");
	    System.out.println("Project 5 - College Analysis");
	    System.out.println("In this project I will write a program that will accept from the user a text file containing college admissions data along with an output filename.");
 	    System.out.println("March 25th, 2019");
	    System.out.println("CMSC 255 Section 003");
	    System.out.println();
	}	

public static void main (String [] args) throws FileNotFoundException, NumberFormatException {
		printHeading();
		
		Scanner scnr = new Scanner (System.in);
		
				//Getting INPUT name from the user
				System.out.print("Input file: ");
					String inputFileName = scnr.next();
					File inputFile = new File (inputFileName);
					
				//Getting OUTPUT name from the user
				System.out.print("Output file: ");
					String outputFileName = scnr.next();
					File outputFile = new File (outputFileName);
				
				//Getting the NUMBER OF LINES from the user
				System.out.print("Number of lines: ");
					int numLines = scnr.nextInt();
				
				//Calling in the parseData method
				parseData(inputFile, outputFile, numLines);	
	}

	//parseData Method
	public static void parseData(File inputFile, File outputFile, int numLines) throws FileNotFoundException {
	
		//Reading in/out the File for the loop
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFile);

		/***********************************************
		Stating the array's needed based off of the file
		************************************************/

		String[] institution = new String[numLines]; //Array for the name of the school
		int[] numUDGS = new int[numLines]; //Array for the amount of undergrads
		double[] percWhite = new double[numLines]; //Array for the percentage of white students
		double[] percBlack = new double[numLines]; //Array for the percentage of the black students
		double[] percHispanic = new double[numLines]; //Array for the percentage of the hispanic students
		double[] percAsian = new double[numLines]; //Array for the percentage of the asian students
		double[] percAmericanIndian = new double[numLines]; //Array for the percentage of the native american students
		double[] percNativeHawaii = new double[numLines]; //Array for the percentage of the native hawaiian students
		double[] percTwoOrMore = new double[numLines]; //Array for the percentage of the students with two or more classifications
		double[] percNonRes = new double[numLines]; //Array for the percentage of non-resident students
		double[] percUnidentified = new double[numLines]; //Array for the percentage of unidentified students
		double[] data = new double[numLines]; //Array for the variable data
		
		
		/********************************
		WHILE loop to populate the arrays
		*********************************/
		in.useDelimiter("\t");
		in.nextLine(); //To skip the first line
		int i = 0;
		while (in.hasNext()) {	
			institution[i] = in.next();
			numUDGS[i] = in.nextInt();
			percWhite[i]= in.nextDouble();
			percBlack[i]= in.nextDouble();
			percHispanic[i] = in.nextDouble();
			percAsian[i]= in.nextDouble();
			percAmericanIndian[i]=in.nextDouble();
			percNativeHawaii[i]=in.nextDouble();
			percTwoOrMore[i]= in.nextDouble();
			percNonRes[i]= in.nextDouble();
			percUnidentified[i]= in.nextDouble();

			i++; //Increment to keep the loop going 
		}

			//Declaring the return/passed in values before calling the methods
      		String highest;
      		double average;
      		String text; //Put before the displayData method
			
			/**************
			Calling Methods
			**************/

			//Calling methods for percWhite
			text = "The institution with the highest White population is: ";
			findHighest(institution, percWhite); // Calling findHighest Method
				highest = findHighest(institution, percWhite); //return vlaue
       		findAverage(percWhite); //Calling findAverage Method
       			average = findAverage(percWhite); //return value
      		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percBlack
      		text = "The institution with the highest Black/African American population is: ";
      		findHighest(institution, percBlack); // Calling findHighest Method
      			highest = findHighest(institution, percBlack); //return vlaue
      		findAverage(percBlack); //Calling findAverage Method
      			average = findAverage(percBlack); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percHispanic
      		text = "The institution with the highest Hispanic population is: ";
      		findHighest(institution, percHispanic); // Calling findHighest Method
      			highest = findHighest(institution, percHispanic); //return vlaue
      		findAverage(percHispanic); //Calling findAverage Method
      			average = findAverage(percHispanic); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percAsian
      		text = "The institution with the highest Asian population is: ";
      		findHighest(institution, percAsian); // Calling findHighest Method
      			highest = findHighest(institution, percAsian); //return vlaue
      		findAverage(percAsian); //Calling findAverage Method
      			average = findAverage(percAsian); //return vlaue
      	    displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percAmericanIndian
      		text = "The institution with the highest American Indian or Alaska Native population is: ";
      		findHighest(institution, percAmericanIndian); // Calling findHighest Method
      			highest = findHighest(institution, percAmericanIndian); //return vlaue
      	    findAverage(percAmericanIndian); //Calling findAverage Method
      	    	average = findAverage(percAmericanIndian); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percNativeHawaii
      		text = "The institution with the highest Native Hawaiian or Other Pacific Islander population is: ";
       		findHighest(institution, percNativeHawaii); // Calling findHighest Method
       			highest = findHighest(institution, percNativeHawaii); //return vlaue
       		findAverage(percNativeHawaii); //Calling findAverage Method
       			average = findAverage(percNativeHawaii); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percTwoOrMore
      		text = "The institution with the highest Two or More classification population is: ";
      		findHighest(institution, percTwoOrMore); // Calling findHighest Method
      			highest = findHighest(institution, percTwoOrMore); //return vlaue
       		findAverage(percTwoOrMore); //Calling findAverage Method
       			average = findAverage(percTwoOrMore); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percNonRes
      		text = "The institution with the highest Non-resident Alien population is: ";
      		findHighest(institution, percNonRes); // Calling findHighest Method
      		    highest = findHighest(institution, percNonRes); //return vlaue
       		findAverage(percNonRes); //Calling findAverage Method
       			average = findAverage(percNonRes); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method


      		//Calling method for percUnidentified
      		text = "The institution with the highest Unidentified population is: ";
      		findHighest(institution, percUnidentified); // Calling findHighest Method
      			highest = findHighest(institution, percUnidentified); //return vlaue
       		findAverage(percUnidentified); //Calling findAverage Method
       			average = findAverage(percUnidentified); //return vlaue
       		displayData(text, highest, average, out); //Calling displayData Method
	
	//Closing input
	in.close();
	//Closing output
	out.close();

	}
		
	//findHighest Method
	public static String findHighest (String [] institution, double[] data) {
		double highestdata = data[0];
		String highest = "";

		for (int i = 1; i < data.length; i++ ) {
			if (data[i] > highestdata) {
				highestdata = data[i]; 
				highest = institution[i]; //Assigns highest to the institution string
			}
		}
		
		//Return Value
		return highest;	
	}
	
	//findAverage Method
	public static double findAverage (double[] data) {
		double total = 0;
		double average = 0;
		
		//Finding Total
		for (double element: data) {
			total = total + element;
		}
			//Find Average
			if (data.length > 0) {
				average = total / data.length;		
			}
		
		//Return Value
		return average;
	}	
	
	//displayData Method
	public static void displayData (String text, String highest, double average, PrintWriter out) {
		highest = highest.trim(); //Keep it on one line
		out.print(text + highest + " and the average is: ");
		out.printf("%5.2f\n", average);
		out.println();
		
	}	
}		
