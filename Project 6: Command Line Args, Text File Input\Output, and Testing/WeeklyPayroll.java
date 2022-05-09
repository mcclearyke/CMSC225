/***************************
* Project 6 - Weekly Payroll
****************************
* This project will input a text file, output a text file, and input the number of rows as command line arguments.
*____________________________
* Kendall McCleary
* April 8th, 2019
* CMSC 255 Section 003
*****************************/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WeeklyPayroll {
 
 public static void printHeading() {
  System.out.println("Kendall McCleary");
  System.out.println("Project 6 - Weekly Payroll");
  System.out.println("This project will input a text file, output a text file, and input the number of rows as command line arguments.");
  System.out.println("April 10th, 2019");
  System.out.println("CMSC 255 Section 003");
  System.out.println();
 }
 
 public static void main(String [] args) throws FileNotFoundException {
    printHeading();
    
    //Variables needed for input
     String inputFileName;
     File input;
     //Varibles needed for output
     String outputFileName;
     File output;
     //Varible needed for number of rows
     int numRows;

     //Variable to keep the try/catch going
     boolean fileworks = false;
     
    	while(!fileworks){
            try {
            
      /*********************************
			Creating the commandline arguments
			**********************************/

            	//input file
            	inputFileName = args[0];
            	input = new File(inputFileName);
        		
        		//output file
        		outputFileName = args[1];
        		output = new File(outputFileName);
	        	
	        	//number of rows
	        	numRows = Integer.parseInt(args[2]); //There are 12 rows
 
	        	fileworks = true; 

	        	//Calling in the parseData Method
	        	parseData(input, output, numRows);

          	}

          	//Catching the exception when given the wrong input file
            catch(FileNotFoundException exception) {
            	System.out.println("File not found, Please try again");
            	System.out.println();
          	}

        }
     	
}
    public static void parseData(File input, File output, int numRows) throws FileNotFoundException {
    	
    	//Reading in/out the File for the loop
		Scanner in = new Scanner(input);
		PrintWriter out = new PrintWriter(output);

    	/***********************************************
		Stating the array's needed based off of the file
		************************************************/

    	String[] employee = new String[numRows]; //Array for the name of the employees
    	int[][] hoursWorked = new int[numRows][numRows]; //Array for the amount of hours worked
    	
    	/*******************************
			Reading the data into the arrays
			********************************/
    	    while (in.hasNext()) {
           	
            	for (int i = 0; i < numRows; i++) {
              
              		//filling the employee array
              		employee[i] = in.next(); //First name
              		employee[i] = employee[i] + " " + in.next(); // Last name
                
                	for (int j = 0; j <= 6; j++) { // 6 because we took 2 columns when we read in the employee name 
                  		
                  		//filling the hoursWorked array
                 		hoursWorked[i][j] = in.nextInt();
                	}
            	}
          	}

             out.println(Arrays.toString(hoursWorked)); 

    		/**************
			Calling Methods
			**************/

			//Calling calcGrossPay
			double[] grossPay = new double[numRows];
			clacGrossPay(hoursWorked);
			grossPay = clacGrossPay(hoursWorked);

			//Calling dayTally
			int[] dayTally = new int[numRows];
			calcDayTally(hoursWorked);
			dayTally = calcDayTally(hoursWorked);

			//Calling displayData
			displayData(employee, grossPay, dayTally, out);

	in.close(); //closing input
	out.close(); //closing output

    }

    public static double[] clacGrossPay(int[][] hoursWorked) {
    //Calculate gross pay for each employee - TAKE THE SUM OF EACH ROW - USE i TO FILL
    double[] grossPay = new double[hoursWorked.length]; 
    final double HOURLY_RATE = 9.50;

    	//Loop for taking the i value in hoursWorked
    	for (int i = 0; i < hoursWorked.length; i++) {
    			
    		int sumRow = 0; //Restarting the sum
    			
    			//Loop for taking the j value in hoursWorked
    			for (int j = 0; j < hoursWorked[i].length; j++) {

    				sumRow = sumRow + hoursWorked[i][j];

    			}

    			//Filling grossPay[]
    			grossPay[i] = sumRow * HOURLY_RATE;	
    	}

    	return grossPay; //Return value
   }

   public static int[] calcDayTally(int[][] hoursWorked) {
   	//Calculate the total number of days worked - TAKE THE SUM OF EACH COL - USE j TO FILL
   		int[] dayTally = new int[hoursWorked.length];

   			//Loop for taking the i value in hoursWorked
   			for (int i = 0; i < hoursWorked.length; i++) {
   				
   				//Loop for taking the j value in hoursWorked
   				for (int j = 0; j < hoursWorked[i].length; j++) {
   					
   					//filling dayTally[]
   					dayTally[j] = dayTally[i] + hoursWorked[i][j];	
   				}
   			}

  		return dayTally; //Return value
  	}


  	public static void displayData(String[] employee, double[] grossPay, int[] dayTally, PrintWriter out) {
  		/******************************************
		Outputting the employee with their grossPay
		******************************************/
  		for (int i = 0; i < employee.length; i++) { 

  			out.print( employee[i] + "\t");
  			out.printf("%5.2f\n", grossPay[i]);
  		}

  		out.println();

		/***********************************************
		Outputting the day of the week with its dayTally
		***********************************************/
  		out.println("Monday \t" + dayTally[0]);
  		out.println("Tuesday \t" + dayTally[1]);
  		out.println("Wednesday \t" + dayTally[2]);
  		out.println("Thursday \t" + dayTally[3]);
  		out.println("Friday \t" + dayTally[4]);
  		out.println("Saturday \t" + dayTally[5]);
  		out.println("Sunday \t" + dayTally[6]);

  	}
}



















