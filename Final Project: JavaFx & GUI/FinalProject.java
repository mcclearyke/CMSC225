import java.util.Scanner;

public class FinalProject { 
	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);

		/*********************
		Inputs for the lengths
		**********************/

  		String lengthSelection1;
  		String lengthSelection2;
  		double lengthValue1;

  		/*************************
		Constants for Calculations
		**************************/

		  // Inches
  		final double INCHES_TO_CENTI = 2.54; // MULTIPLY
  		final double INCHES_TO_METERS = 39.37; // DIVIDE
  		final double INCHES_TO_KILOMETERS = 39370.079; // DIVIDE
  		final double INCHES_TO_FEET = 12; // DIVIDE
  		final double INCHES_TO_MILE = 63360; // DIVIDE


  		// Feet
		 final double FEET_TO_CENTI = 30.48; // MULTIPLY
  		final double FEET_TO_METERS = 3.281; // DIVIDE
  		final double FEET_TO_KILOMETERS = 3280.84; // DIVIDE
     		final double FEET_TO_INCHES = 12; // MULTIPLY
      		final double FEET_TO_MILE = 5280; // DIVIDE

  		// Mile
		final double MILE_TO_CENTI = 160934.4; // MULTIPLY
  		final double MILE_TO_METERS = 1609.34; // MULTIPLY
  		final double MILE_TO_KILOMETERS = 1.60934; // MULTIPLY
      		final double MILE_TO_INCHES = 63360; // MULTIPLY
      		final double MILE_TO_FEET = 5280; // MULTIPLY

		// Centimeters
		final double CENTI_TO_INCHES = 2.54; // DIVIDE
  		final double CENTI_TO_FEET = 30.48; // DIVIDE
  		final double CENTI_TO_MILES = 160934.4; // DIVIDE
      		final double CENTI_TO_METERS = 100; // DIVIDE
      		final double CENTI_TO_KIL0METERS = 100000; // DIVIDE

  		// Meters
  		final double METERS_TO_INCHES = 39.37; // MULTIPLY
  		final double METERS_TO_FEET = 3.281; // MULTIPLY
  		final double METERS_TO_MILES = 1609.344; // DIVIDE
      		final double METERS_TO_CENTI = 100; // MULTIPLY
     		 final double METERS_TO_KILOMETERS =  1000; // DIVIDE

  		// Kilometers
  		final double KILO_TO_INCHES = 39370.079; // MULTIPLY
  		final double KILO_TO_FEET = 3280.84; // MULTIPLY
  		final double KILO_TO_MILES = 1.609; // DIVIDE
      		final double KILO_TO_CENTI = 100000; // MULTIPLY
      		final double KILO_TO_METERS = 1000; // MULTIPLY


  		int i = 1;
     		 // loop to keep the conversion going
  		while (i > 0) {

      //Options for the lengths to be converted
      System.out.println("The lengths you can choose from are: ");
      System.out.println("Inches");
      System.out.println("Feet");
      System.out.println("Miles");
      System.out.println("Centimeters");
      System.out.println("Meters");
      System.out.println("Kilometers");
      System.out.println();

      //Entering the length that they want to get converted
  	System.out.print("Please enter the length you would like to have converted: ");
  	lengthSelection1 = in.next();
      	lengthSelection1= lengthSelection1.substring(0,1).toUpperCase() + lengthSelection1.substring(1).toLowerCase();

      //Entering how long the length is that they want to get converted
  	System.out.print("Please enter how many " + lengthSelection1 + " you'd like to be converted: ");
  	lengthValue1 = in.nextDouble();
  	System.out.println();

      //Entering what length they want it to be converted too
  	System.out.print("Please enter what length you would like " + lengthSelection1 + " to be converted to: ");
  	lengthSelection2 = in.next();
      	lengthSelection2 = lengthSelection2.substring(0,1).toUpperCase() + lengthSelection2.substring(1).toLowerCase();
  	System.out.println();


  	/*********************************
  	Calculations if INCHES is Selected
  	**********************************/

  	//Inches and Centimeters
  	if ((lengthSelection1.equals("Inches") || lengthSelection1.equals("Inch")) && (lengthSelection2.equals("Centimeters") || lengthSelection2.equals("Centimeter"))) {
  			
  		double lengthValue2 = lengthValue1 * INCHES_TO_CENTI;
  			
  		System.out.printf("%,5.2f", lengthValue1);
        	System.out.print(" " + lengthSelection1 + " is ");
        	System.out.printf("%,5.2f", lengthValue2);
        	System.out.println(" " + lengthSelection2);
        	System.out.println();
  	}

  	//Inches and Meters
  	if ((lengthSelection1.equals("Inches") || lengthSelection1.equals("Inch")) && (lengthSelection2.equals("Meters") || lengthSelection2.equals("Meter"))) {
  			
  		double lengthValue2 = lengthValue1 / INCHES_TO_METERS;
  			
  		System.out.printf("%,5.2f", lengthValue1);
        	System.out.print(" " + lengthSelection1 + " is ");
        	System.out.printf("%,5.4f", lengthValue2);
        	System.out.println(" " + lengthSelection2);
        	System.out.println();
  	}

  	//Inches and Kilometers
  	if ((lengthSelection1.equals("Inch") || lengthSelection1.equals("Inch")) && (lengthSelection2.equals("Kilometers") || lengthSelection2.equals("Kilometer"))) {
  			
  		double lengthValue2 = lengthValue1 / INCHES_TO_KILOMETERS;
  			
  		System.out.printf("%,5.2f", lengthValue1);
        	System.out.print(" " + lengthSelection1 + " is ");
        	System.out.printf("%,5.4f", lengthValue2);
        	System.out.println(" " + lengthSelection2);
        	System.out.println();
  	}

  	//Inches and Feet
  	if ((lengthSelection1.equals("Inches") || lengthSelection1.equals("Inch")) && (lengthSelection2.equals("Feet") || lengthSelection2.equals("Foot"))) {
  			
  		double lengthValue2 = lengthValue1 / INCHES_TO_FEET;
  			
  		System.out.printf("%,5.2f", lengthValue1);
        	System.out.print(" " + lengthSelection1 + " is ");
        	System.out.printf("%,5.4f", lengthValue2);
        	System.out.println(" " + lengthSelection2);
        	System.out.println();
  	}

  	//Inches and Mile
  	if ((lengthSelection1.equals("Inches") || lengthSelection1.equals("Inch")) && (lengthSelection2.equals("Miles") || lengthSelection2.equals("Mile"))) {
  			
       		double lengthValue2 = lengthValue1 / INCHES_TO_MILE;
  			
  		System.out.printf("%,5.2f", lengthValue1);
        	System.out.print(" " + lengthSelection1 + " is ");
        	System.out.printf("%,5.4f", lengthValue2);
        	System.out.println(" " + lengthSelection2);
        	System.out.println();
  	}

      /*********************************
      Calculations if FEET is Selected
      **********************************/

      //Feet and Centimeters
      if ((lengthSelection1.equals("Feet") || lengthSelection1.equals("Foot")) && (lengthSelection2.equals("Centimeters") || lengthSelection2.equals("Centimeter"))) {
        
        double lengthValue2 = lengthValue1 * FEET_TO_CENTI;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Feet and Meters
      if ((lengthSelection1.equals("Feet") || lengthSelection1.equals("Foot")) && (lengthSelection2.equals("Meters") || lengthSelection2.equals("Meter"))) {
        
        double lengthValue2 = lengthValue1 / FEET_TO_METERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Feet and Kilometers
      if ((lengthSelection1.equals("Feet") || lengthSelection1.equals("Foot")) && (lengthSelection2.equals("Kilometers") || lengthSelection2.equals("Kilometer"))) {
        
        double lengthValue2 = lengthValue1 / FEET_TO_KILOMETERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Feet and Inches
      if ((lengthSelection1.equals("Feet") || lengthSelection1.equals("Foot")) && (lengthSelection2.equals("Inches") || lengthSelection2.equals("Inch"))) {
        
        double lengthValue2 = lengthValue1 * FEET_TO_INCHES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Feet and Mile
      if ((lengthSelection1.equals("Feet") || lengthSelection1.equals("Foot")) && (lengthSelection2.equals("Miles") || lengthSelection2.equals("Mile"))) {
        
        double lengthValue2 = lengthValue1 / FEET_TO_MILE;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      /********************************
      Calculations if MILE is Selected
      ********************************/

      //Miles and Centimeters
      if ((lengthSelection1.equals("Miles") || lengthSelection1.equals("Mile")) && (lengthSelection2.equals("Centimeters") || lengthSelection2.equals("Centimeter"))) {
        
        double lengthValue2 = lengthValue1 * MILE_TO_CENTI;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Miles and Meters
      if ((lengthSelection1.equals("Miles") || lengthSelection1.equals("Mile")) && (lengthSelection2.equals("Meters") || lengthSelection2.equals("Meter"))) {
        
        double lengthValue2 = lengthValue1 * MILE_TO_METERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Miles and Kilometers
      if ((lengthSelection1.equals("Miles") || lengthSelection1.equals("Mile")) && (lengthSelection2.equals("Kilometers") || lengthSelection2.equals("Kilometer"))) {
        
        double lengthValue2 = lengthValue1 * MILE_TO_KILOMETERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Miles and Inch
      if ((lengthSelection1.equals("Miles") || lengthSelection1.equals("Mile")) && (lengthSelection2.equals("Inches") || lengthSelection2.equals("Inch"))) {
        
        double lengthValue2 = lengthValue1 * MILE_TO_INCHES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Miles and Feet
      if ((lengthSelection1.equals("Miles") || lengthSelection1.equals("Mile")) && (lengthSelection2.equals("Feet") || lengthSelection2.equals("Foot"))) {
        
        double lengthValue2 = lengthValue1 * MILE_TO_FEET;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      /********************************
      Calculations if CENTI is Selected
      *********************************/

      //Centimeters and Miles
       if ((lengthSelection1.equals("Centimeters") || lengthSelection1.equals("Centimeter")) && (lengthSelection2.equals("Miles") || lengthSelection2.equals("Mile"))) {
        
        double lengthValue2 = lengthValue1 / CENTI_TO_MILES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Centimeters and Meters
      if ((lengthSelection1.equals("Centimeters") || lengthSelection1.equals("Centimeter")) && (lengthSelection2.equals("Meters") || lengthSelection2.equals("Meter"))) {
        
        double lengthValue2 = lengthValue1 / CENTI_TO_METERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Centimeters and Kilometers
      if ((lengthSelection1.equals("Centimeters") || lengthSelection1.equals("Centimeter")) && (lengthSelection2.equals("Kilometers") || lengthSelection2.equals("Kilometer"))) {
        
        double lengthValue2 = lengthValue1 / CENTI_TO_KIL0METERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Centimeters and Inches
      if ((lengthSelection1.equals("Centimeters") || lengthSelection1.equals("Centimeter")) && (lengthSelection2.equals("Inches") || lengthSelection2.equals("Inch"))) {
        
        double lengthValue2 = lengthValue1 / CENTI_TO_INCHES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Centimeters and Feet
      if ((lengthSelection1.equals("Centimeters") || lengthSelection1.equals("Centimeter")) && (lengthSelection2.equals("Feet") || lengthSelection2.equals("Foot"))) {
        
        double lengthValue2 = lengthValue1 / CENTI_TO_FEET;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      /********************************
      Calculations if METER is Selected
      ********************************/
      
      //Meters and Miles
      if ((lengthSelection1.equals("Meters") || lengthSelection1.equals("Meter")) && (lengthSelection2.equals("Miles") || lengthSelection2.equals("Mile"))) {
        
        double lengthValue2 = lengthValue1 / METERS_TO_MILES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Meters and Centimeters
      if ((lengthSelection1.equals("Meters") || lengthSelection1.equals("Meter")) && (lengthSelection2.equals("Centimeters") || lengthSelection2.equals("Centimeter"))) {
        
        double lengthValue2 = lengthValue1 * METERS_TO_CENTI;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Meters and Kilometers
      if ((lengthSelection1.equals("Meters") || lengthSelection1.equals("Meter")) && (lengthSelection2.equals("Kilometers") || lengthSelection2.equals("Kilometer"))) {
        
        double lengthValue2 = lengthValue1 / METERS_TO_KILOMETERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Meters and Inch
      if ((lengthSelection1.equals("Meters") || lengthSelection1.equals("Meter")) && (lengthSelection2.equals("Inches") || lengthSelection2.equals("Inch"))) {
        
        double lengthValue2 = lengthValue1 * METERS_TO_INCHES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Meters and Feet
      if ((lengthSelection1.equals("Meters") || lengthSelection1.equals("Meter")) && (lengthSelection2.equals("Feet") || lengthSelection2.equals("Foot"))) {
        
        double lengthValue2 = lengthValue1 * METERS_TO_FEET;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      /********************************
      Calculations if KILO is Selected
      ********************************/
      
      //Kilometers and Miles
      if ((lengthSelection1.equals("Kilometers") || lengthSelection1.equals("Kilometer")) && (lengthSelection2.equals("Miles") || lengthSelection2.equals("Mile"))) {
        
        double lengthValue2 = lengthValue1 / KILO_TO_MILES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.4f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Kilometers and Centimeters
      if ((lengthSelection1.equals("Kilometers") || lengthSelection1.equals("Kilometer")) && (lengthSelection2.equals("Centimeters") || lengthSelection2.equals("Centimeter"))) {
        
        double lengthValue2 = lengthValue1 * KILO_TO_CENTI;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Kilometers and Meters
      if ((lengthSelection1.equals("Kilometers") || lengthSelection1.equals("Kilometer")) && (lengthSelection2.equals("Meters") || lengthSelection2.equals("Meter"))) {
        
        double lengthValue2 = lengthValue1 * KILO_TO_METERS;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Kilometers and Inch
      if ((lengthSelection1.equals("Kilometers") || lengthSelection1.equals("Kilometer")) && (lengthSelection2.equals("Inches") || lengthSelection2.equals("Inch"))) {
        
        double lengthValue2 = lengthValue1 * KILO_TO_INCHES;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }

      //Kilometers and Feet
      if ((lengthSelection1.equals("Kilometers") || lengthSelection1.equals("Kilometer")) && (lengthSelection2.equals("Feet") || lengthSelection2.equals("Foot"))) {
        
        double lengthValue2 = lengthValue1 * KILO_TO_FEET;
        
        System.out.printf("%,5.2f", lengthValue1);
        System.out.print(" " + lengthSelection1 + " is ");
        System.out.printf("%,5.2f", lengthValue2);
        System.out.println(" " + lengthSelection2);
        System.out.println();
      }
            
            // Asking the user if they want to continue Converting
            System.out.println("Would you like to do another conversion:");
            System.out.print("Enter 'y' to continue or 'q' to quit: ");
            char userChar = in.next().charAt(0);

                // User input 'y' if the want to continue the loop
                if (userChar == 'y') {
                ++i;
                System.out.println();
                System.out.println();
                }

                // User input 'q' to end the loop
                if (userChar == 'q') {
                i--;
                System.out.println();
                System.out.println("Thank you for converting with us!");  
                }
    }
  }
  }
