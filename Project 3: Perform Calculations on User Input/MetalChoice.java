/***************************
* Project 3 - MetalChoice
****************************
* This project will calculate the cost of building metal art structures.
*____________________________
* Kendall McCleary
* Febuary 4th, 2019
* CMSC 255 Section 003
*****/

import java.util.Scanner;
import java.lang.Math;

public class MetalChoice {
 public static void printHeading() {
  System.out.println("Kendall McCleary");
  System.out.println("Project 3 - MetalChoice");
  System.out.println("This project will calculate the cost of building multiple metal art structures.");
  System.out.println("Febuary 20th, 2019");
  System.out.println("CMSC 255 Section 003");
  System.out.println();
 }
 
 public static void main(String [] args) {
    printHeading();

      Scanner in = new Scanner(System.in);

     // Stating inputs for the Measurements

      String name; // input for name
      double baseLength1; // Enter value for FIRST pyramid
      double heightLength1; // Enter value for FIRST pyramid
      double baseLength2; // Enter value for SECOND pyramid
      double heightLength2; // Enter value for SECOND pyramid
      double heightPrism; // Enter value for rectangular prism
      double lengthPrism; // Enter value for rectangular prism
      double widthPrism; // Enter value for rectangular prism

    // Stating the inputs for the Calculations

      double areaBase1; // Enter base area value for the FIRST pyramid
      double areaBase2; // Enter base area value for the SECOND pyramid
      double slantLength1; // Enter slant length value for the FIRST pyramid
      double slantLength2; // Enter slant length value for the SECOND pyramid
      double areaPyramid1; // Enter surface area value for the FIRST pyramid
      double areaPyramid2; // Enter surface area value for the SECOND pyramid
      double areaPrism; // Enter surface area value for the Rectangular Prism
      double totalArea; // Enter total surface area value
      double totalCost; // Enter total cost vlaue
      final double COST_PER_INCH = 1.67; // Enter cost per inch constant vlaue
 
    /************
    Input the name
    *************/

      System.out.print("Enter the name of the pyramid: ");
        name = in.nextLine();
      

    // Input the vales of the first pyramid

      /***********************************
      Input the length of the FIRST pyramid
      ************************************/

      System.out.print("Enter the length of the base of the first pyramid (inches): "); 
        baseLength1 = in.nextDouble();

      /***********************************
      Input the height of the FIRST pyramid
      ************************************/

      System.out.print("Enter the height of the first pyramid (inches): "); 
        heightLength1 = in.nextDouble();
      
    // Input the values of the second pyramid

      /************************************
      Input the length of the SECOND pyramid
      *************************************/

      System.out.print("Enter the length of the base of the second pyramid (inches): "); 
        baseLength2 = in.nextDouble();

      /*************************************
      Input the height of the SECOND pyramid
      *************************************/

      System.out.print("Enter the height of the second pyramid (inches): "); 
        heightLength2 = in.nextDouble();

    // Input values of the rectangular prism

      /***************
      Input the height 
      ***************/

      System.out.print("Enter the height of the rectangular prism (inches): "); // height
        heightPrism = in.nextDouble();
    
      /***************
      Input the length
      ***************/

      System.out.print("Enter the length of the rectangular prism (inches): "); // length
        lengthPrism = in.nextDouble();

      /*************
      Input the width 
      **************/

      System.out.print("Enter the width of the rectangular prism (inches): "); // width
        widthPrism = in.nextDouble();
        System.out.println();
 

    /********************************
    Output the calculations statement
    ********************************/

    System.out.println("The " + name + " surface area calculations are: ");


      /********************************************
      Finding the surface area of the FIRST pyramid
      ********************************************/

      areaBase1 = 0.5 * baseLength1 * Math.sqrt(Math.pow(baseLength1, 2) - Math.pow(0.5 * baseLength1, 2)); // Finding B - (1/2) * b * Math.sqrt(Math.pow(b,2) - Math.pow(((1/2) * b), 2))

      slantLength1 = Math.sqrt((Math.pow(0.5 * baseLength1, 2)) + (Math.pow(heightLength1, 2))); // Finding l -  Math.sqrt((Math.pow((1/2) * b, 2)) + (Math.pow(h, 2)))

      areaPyramid1 = areaBase1 + 0.5 * (3 * baseLength1 * slantLength1); // Finding Surface Area - B + (1/2) * (3 * b * l)
        
        System.out.print("Surface area of the first pyramid: ");
        System.out.printf("%,5.2f", areaPyramid1);
        System.out.print(" square inches");
        System.out.println();

      /*********************************************
      Finding the surface area of the SECOND pyramid
      *********************************************/

      areaBase2 = 0.5 * baseLength2 * Math.sqrt(Math.pow(baseLength2, 2) - Math.pow(0.5 * baseLength2, 2)); // Finding B - (1/2) * b * Math.sqrt(Math.pow(b,2) - Math.pow(((1/2) * b), 2))
      
      slantLength2 = Math.sqrt((Math.pow(0.5 * baseLength2, 2)) + (Math.pow(heightLength2, 2))); // Finding l -  Math.sqrt((Math.pow((1/2) * b, 2)) + (Math.pow(h, 2)))

      areaPyramid2 = areaBase2 + 0.5 * (3 * baseLength2 * slantLength2); // // Finding Surface Area - B + (1/2) * (3 * b * l)
        
        System.out.print("Surface area of the second pyramid: ");
        System.out.printf("%,5.2f", areaPyramid2);
        System.out.print(" square inches");
        System.out.println();

      /*************************************************
      Finding the surface area of the Rectangular Prism
      Surface Area = 2lw + 2lh + 2wh
      *************************************************/

      areaPrism = (2 * lengthPrism * widthPrism) + (2 * lengthPrism * heightPrism) + (2 * widthPrism * heightPrism); // finding the Surface Area of the rectangular prism

        System.out.print("Surface area of the Rectangular Prism: ");
        System.out.printf("%,5.2f", areaPrism);
        System.out.print(" square inches");
        System.out.println();
        System.out.println();

      /************************************************
      Finding Total Surface Area
      Total SA = areaPyramid1 + areaPyramid2 + areaPrism
      *************************************************/

      totalArea = areaPyramid1 + areaPyramid2 + areaPrism;

        System.out.print("Total Surface area: "); 
        System.out.printf("%,5.2f", totalArea);
        System.out.print(" square inches");
        System.out.println();

      

      /*****************************
      Claculate the Total Cost
      Total Cost = total area * 1.67
      *****************************/

    
      totalCost = totalArea;

        System.out.print("The total cost of the material to build " + name + " is $");
        System.out.printf("%,5.2f", totalCost);
        System.out.println();
        System.out.println();
        
    /******************************
    Stating inputs for the Choices
    all the prices and totalPrices are decared in their respective 
    if statements so that the stating block isn't too long
    ******************************/
     
    // Prices for the Metals (per inch)
    final double ALUMINUM_COST_PER_INCH = 1.50;
    final double STEEL_COST = 2.85; 
    final double TITANIUM_COST = 4.50; 

    // Name Plate Material Price
    final double BRONZE_COST = 8.00; 
    final double SILVER_COST = 12.50;
    final double GOLD_COST = 19.99;

    // Letters Price
    final double FIRST_FIVE = 19.99; // Cost for the first 5 letters
    final double SIX_TO_TEN_PER_LETTER = 2.50; // Cost for 6 - 10 letters
    final double TEN_OR_MORE_PER_LETTER = 1.85; // Cost for over 10 letters
      
    // Discount when gold and over 10 letters are choosen
    final double CUSTOMER_DISCOUNT = 2.00;
  
    int number; // How many sculptures they want
    int i; // Initalize i (while loop)
    int k; // Initialize k (name for loop)
    double grandTotal; // Calculate the grand total of the sculptures
    char metalType; // The type of metal that'll be used
    char namePlate; // Material of name plate
    String letterLength; // The name the user inputs 
    int upperCount = 0; // For counting uppercase letters
    int lowerCount = 0; // For counting lowercase letters
    int totalLetters; // How long the name inputed is
    char userChar; // The condition to keep the loop going



    /********************************
    Getting the input for the choices
    *********************************/

    i = 1; // Giving i a value before the while loop starts
    grandTotal = 0; // Giving grand total a value before the loop starts

      // Enter how many sculptures they want
      System.out.print("Enter how many sculptures you want: ");
      number = in.nextInt();
      System.out.println();
    
   // The loop that will keep the program running for however many sculptures the customer wants!     
   while (number >= i) {   
    
      // Enter the type of metal they would like the sculpture to be
      System.out.println("What would you like your sculpture to be made out of?"); 
      System.out.print("Enter 'A' for Aluminum, 'S' for Steel, or 'T' for Titanim: ");
          metalType = in.next().charAt(0);
          
          //if user enters a character that wasn't listed for metalType
          if ((metalType != 'A') && (metalType != 'S') && (metalType != 'T')) {
            System.out.println();
            System.out.println("ERROR! Please enter a valid option!");
            System.out.println();
              System.out.println("What would you like your sculpture to be made out of?"); 
              System.out.print("Enter 'A' for Aluminum, 'S' for Steel, or 'T' for Titanim: ");
                metalType = in.next().charAt(0);
          }

          if (metalType == 'A') {
           double metalPick = ALUMINUM_COST_PER_INCH;
          }

          if (metalType == 'S') {
            double metalPick = STEEL_COST;
          }
    
          if (metalType == 'T') {
           double metalPick = TITANIUM_COST;
          }

      // Enter what they would like the name plate to be made out of
      System.out.println("What type of name plate will you like?");
      System.out.print("Enter 'g' for Gold, 's' for Silver Pleated, or 'b' for Bronze: ");
          namePlate = in.next().charAt(0);

          //if user enters a character that wasn't listed for namePlate
          if ((namePlate != 'g') && (namePlate != 's') && (namePlate != 'b')) {
          System.out.println();
          System.out.println("ERROR! Please enter a valid option!");
          System.out.println();
              System.out.println("What type of name plate will you like?");
              System.out.print("Enter 'g' for Gold, 's' for Silver Pleated, or 'b' for Bronze: ");
                namePlate = in.next().charAt(0);
          }

          if (namePlate == 'g') {
            double namePick = GOLD_COST;
          }

          if (namePlate == 's') {
            double namePick = SILVER_COST;
          }

          if (namePlate == 'b') {
            double namePick = BRONZE_COST;
          }
  
      // Enter what they would like written on the name plate
      System.out.println("What would you like written on the name plate?");
      System.out.print("Please enter ONE word: ");
        letterLength = in.next();
        System.out.println();


        /***********************************************
        Finding how many letters are in the name inputed
        ************************************************/

        for (k = 0; k < letterLength.length(); ++k) {
          if (Character.isUpperCase(letterLength.charAt(k))) {
            ++upperCount;
          }
          if (Character.isLowerCase(letterLength.charAt(k))) {
            ++lowerCount;
          }
        }
          totalLetters = (upperCount + lowerCount); // the total amount of letters in the name
      
      
    /********************************************
    Calculations for the userinput 'A' - ALUMINUM
    *********************************************/     
      
      // Finding and displaying the price of Aluminum with GOLD and a Name 5 letters or less
      if (totalLetters <= 5) {
          double priceA1 = (metalPick * totalArea) + namePick + FIRST_FIVE;
          double totalPriceA1 = priceA1 + totalCost; 
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceA1);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceA1; // Adding on to the grand total
        }

      // Finding and displaying the price of Aluminum with GOLD and a Name inbetween 6 and 10 letters
      if (totalLetters >= 6) && (totalLetters <= 10 ) {
          double priceA2 = (metalPick * totalArea) + namePick + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
          double totalPriceA2 = priceA2 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceA2);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceA2; // Adding on to the grand total
        } 

      // Finding and displaying the price of Aluminum with GOLD and a Name more than 10 letters
      if ((metalType == 'A') && (namePlate == 'g') && (totalLetters > 10)) {
          double priceA3 = (metalPick * totalArea) + namePick + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
          double totalPriceA3 = (priceA3 + totalCost) - CUSTOMER_DISCOUNT;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceA3);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceA3; // Adding on to the grand total
      }


      // Finding and displaying the price of Aluminum with SILVER and a Name 5 letters or less
      if ((metalType == 'A') && (namePlate == 's') && (totalLetters <= 5)) {
        double priceA4 = (ALUMINUM_COST_PER_INCH * totalArea) + SILVER_COST + FIRST_FIVE;
        double totalPriceA4 = priceA4 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceA4);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceA4; // Adding on to the grand total
      }

    // Finding and displaying the price of Aluminum with SILVER and a Name inbetween 6 and 10 letters
    if ((metalType == 'A') && (namePlate == 's') && (totalLetters >= 6) && (totalLetters <= 10 )) {
        double priceA5 = (ALUMINUM_COST_PER_INCH * totalArea) + SILVER_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
        double totalPriceA5 = priceA5 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceA5);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceA5; // Adding on to the grand total
      } 

      // Finding and displaying the price of Aluminum with SILVER and a Name more than 10 letters
      if ((metalType == 'A') && (namePlate == 's') && (totalLetters > 10)) {
        double priceA6 = (ALUMINUM_COST_PER_INCH * totalArea) + SILVER_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
        double totalPriceA6 = priceA6 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceA6);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceA6; // Adding on to the grand total
      }

      // Finding and displaying the price of Aluminum with BRONZE and a Name 5 letters or less
      if ((metalType == 'A') && (namePlate == 'b') && (totalLetters <= 5)) {
          double priceA7 = (ALUMINUM_COST_PER_INCH * totalArea) + BRONZE_COST + FIRST_FIVE;
          double totalPriceA7 = priceA7 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceA7);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceA7; // Adding on to the grand total
      }

      // Finding and displaying the price of Aluminum with BRONZE and a Name inbetween 6 and 10 letters
      if ((metalType == 'A') && (namePlate == 'b') && (totalLetters >= 6) && (totalLetters <= 10 )) {
          double priceA8 = (ALUMINUM_COST_PER_INCH * totalArea) + BRONZE_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
          double totalPriceA8 = priceA8 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceA8);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceA8; // Adding on to the grand total
      } 

      // Finding and displaying the price of Aluminum with BRONZE and a Name more than 10 letters
      if ((metalType == 'A') && (namePlate == 'b') && (totalLetters > 10)) {
          double priceA9 = (ALUMINUM_COST_PER_INCH * totalArea) + BRONZE_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
          double totalPriceA9 = priceA9 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceA9);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceA9; // Adding on to the grand total
      }       
      

    /*******************************************
    Calculations for the userinput 'S' - STEEL
    *********************************************/
    
      // Finding and displaying the price of Steel with GOLD and a Name 5 letters or less
      if ((metalType == 'S') && (namePlate == 'g') && (totalLetters <= 5)) {
          double priceS1 = (STEEL_COST * totalArea) + GOLD_COST + FIRST_FIVE;
          double totalPriceS1 = priceS1 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceS1);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceS1; // Adding on to the grand total
        }

      // Finding and displaying the price of Steel with GOLD and a Name inbetween 6 and 10 letters
      if ((metalType == 'S') && (namePlate == 'g') && (totalLetters >= 6) && (totalLetters <= 10 )) {
          double priceS2 = (STEEL_COST * totalArea) + GOLD_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
          double totalPriceS2 = priceS2 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceS2);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceS2; // Adding on to the grand total
        } 

      // Finding and displaying the price of Steel with GOLD and a Name more than 10 letters
      if ((metalType == 'S') && (namePlate == 'g') && (totalLetters > 10)) {
          double priceS3 = (STEEL_COST * totalArea) + GOLD_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
          double totalPriceS3 = (priceS3  + totalCost) - CUSTOMER_DISCOUNT;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceS3);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceS3; // Adding on to the grand total
        }

      // Finding and displaying the price of Steel with SILVER and a Name 5 letters or less
     if ((metalType == 'S') && (namePlate == 's') && (totalLetters <= 5)) {
        double priceS4 = (STEEL_COST * totalArea) + SILVER_COST + FIRST_FIVE;
        double totalPriceS4 = priceS4 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceS4);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceS4; // Adding on to the grand total
      }

    // Finding and displaying the price of Steel with SILVER and a Name inbetween 6 and 10 letters
    if ((metalType == 'S') && (namePlate == 's') && (totalLetters >= 6) && (totalLetters <= 10 )) {
        double priceS5 = (STEEL_COST * totalArea) + SILVER_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
        double totalPriceS5 = priceS5 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceS5);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceS5; // Adding on to the grand total
      } 

      // Finding and displaying the price of Steel with SILVER and a Name more than 10 letters
      if ((metalType == 'S') && (namePlate == 's') && (totalLetters > 10)) {
        double priceS6 = (STEEL_COST * totalArea) + SILVER_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
        double totalPriceS6 = priceS6 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceS6);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceS6; // Adding on to the grand total
      }

      // Finding and displaying the price of Steel with BRONZE and a Name 5 letters or less
      if ((metalType == 'S') && (namePlate == 'b') && (totalLetters <= 5)) {
        double priceS7 = (STEEL_COST * totalArea) + BRONZE_COST + FIRST_FIVE;
        double totalPriceS7 = priceS7 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceS7);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceS7; // Adding on to the grand total
      } 

      // Finding and displaying the price of Steel with BRONZE and a Name inbetween 6 and 10 letters
      if ((metalType == 'S') && (namePlate == 'b') && (totalLetters >= 6) && (totalLetters <= 10 )) {
        double priceS8 = (STEEL_COST * totalArea) + BRONZE_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
        double totalPriceS8 = priceS8 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceS8);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceS8; // Adding on to the grand total
      } 

      // Finding and displaying the price of Steel with BRONZE and a Name more than 10 letters
      if ((metalType == 'S') && (namePlate == 'b') && (totalLetters > 10)) {
        double priceS9 = (STEEL_COST * totalArea) + BRONZE_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
        double totalPriceS9 = priceS9 + totalCost;
          System.out.print("Your sculpture will be $");
          System.out.printf("%,5.2f", totalPriceS9);
          System.out.println();
          System.out.println();
          grandTotal = grandTotal + totalPriceS9; // Adding on to the grand total
      }

    /********************************************
    Calculations for the userinput 'T' - TITANIUM
    *********************************************/

      // Finding and displaying the price of Titanium with GOLD and a Name 5 letters or less
      if ((metalType == 'T') && (namePlate == 'g') && (totalLetters <= 5)) {
          double priceT1 = (TITANIUM_COST * totalArea) + GOLD_COST + FIRST_FIVE;
          double totalPriceT1 = priceT1 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT1);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT1; // Adding on to the grand total
        }

      // Finding and displaying the price of Titanium with GOLD and a Name inbetween 6 and 10 letters
      if ((metalType == 'T') && (namePlate == 'g') && (totalLetters >= 6) && (totalLetters <= 10 )) {
          double priceT2 = (TITANIUM_COST * totalArea) + GOLD_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
          double totalPriceT2 = priceT2 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT2);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT2; // Adding on to the grand total
        } 

      // Finding and displaying the price of Titanium with GOLD and a Name more than 10 letters
      if ((metalType == 'T') && (namePlate == 'g') && (totalLetters > 10)) {
          double priceT3 = (TITANIUM_COST * totalArea) + GOLD_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
          double totalPriceT3 = (priceT3 + totalCost) - CUSTOMER_DISCOUNT;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT3);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT3; // Adding on to the grand total
      }

      // Finding and displaying the price of Titanium with SILVER and a Name 5 letters or less
      if ((metalType == 'T') && (namePlate == 's') && (totalLetters <= 5)) {
          double priceT4 = (TITANIUM_COST * totalArea) + SILVER_COST + FIRST_FIVE;
          double totalPriceT4 = priceT4 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT4);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT4; // Adding on to the grand total
      }

    // Finding and displaying the price of Titanium with SILVER and a Name inbetween 6 and 10 letters
    if ((metalType == 'T') && (namePlate == 's') && (totalLetters >= 6) && (totalLetters <= 10 )) {
        double priceT5 = (TITANIUM_COST * totalArea) + SILVER_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
        double totalPriceT5 = priceT5 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT5);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT5; // Adding on to the grand total
      } 

      // Finding and displaying the price of Titanium with SILVER and a Name more than 10 letters
      if ((metalType == 'T') && (namePlate == 's') && (totalLetters > 10)) {
          double priceT6 = (TITANIUM_COST * totalArea) + SILVER_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
          double totalPriceT6 = priceT6 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT6);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT6; // Adding on to the grand total
      }

      // Finding and displaying the price of Titanium with BRONZE and a Name 5 letters or less
      if ((metalType == 'T') && (namePlate == 'b') && (totalLetters <= 5)) {
          double priceT7 = (TITANIUM_COST * totalArea) + BRONZE_COST + FIRST_FIVE;
          double totalPriceT7 = priceT7 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT7);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT7; // Adding on to the grand total
      }

      // Finding and displaying the price of Titanium with BRONZE and a Name inbetween 6 and 10 letters
      if ((metalType == 'T') && (namePlate == 'b') && (totalLetters >= 6) && (totalLetters <= 10 )) {
          double priceT8 = (TITANIUM_COST * totalArea) + BRONZE_COST + (FIRST_FIVE + ((totalLetters - 5) * SIX_TO_TEN_PER_LETTER));
          double totalPriceT8 = priceT8 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT8);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT8; // Adding on to the grand total
      }
      // Finding and displaying the price of Titanium with BRONZE and a Name more than 10 letters
      if ((metalType == 'T') && (namePlate == 'b') && (totalLetters > 10)) {
          double priceT9 = (TITANIUM_COST * totalArea) + BRONZE_COST + (FIRST_FIVE + (((totalLetters - 10) * TEN_OR_MORE_PER_LETTER) * SIX_TO_TEN_PER_LETTER));
          double totalPriceT9 = priceT9 + totalCost;
            System.out.print("Your sculpture will be $");
            System.out.printf("%,5.2f", totalPriceT9);
            System.out.println();
            System.out.println();
            grandTotal = grandTotal + totalPriceT9; // Adding on to the grand total
      }
          /****************************
          When the loop reaches its end
          *****************************/

          if (i == number) {

            //Displaying the total amount owed
            System.out.print("The grand total for your sculptures is $");
            System.out.printf("%,5.2f", grandTotal);
            System.out.println();
            System.out.println();
            
            // Asking the user if they want to continue the loop
            System.out.println("Would you like to continue?");
            System.out.print("Enter 'y' to Continue or 'q' to end: ");
              userChar = in.next().charAt(0);

                // User input 'y' if the want to continue the loop
                if (userChar == 'y') {
                ++number;
                System.out.println();
               }

                // User input 'q' to end the loop
                else if (userChar == 'q') {
                System.out.println();
                System.out.println("Thank you for doing business with us!");  
                }

                // Restating the options if an ivalid character was entered
                else {
                  System.out.println("ERROR! Please enter a valid command!");
                  System.out.println();
                  System.out.println("Would you like to continue?");
                      System.out.print("Enter 'y' to Continue or 'q' to end: ");
                      userChar = in.next().charAt(0);

                      if (userChar == 'y') {
                      ++number;
                      System.out.println();
                      }

                     else if (userChar == 'q') {
                    System.out.println();
                    System.out.println("Thank you for doing business with us!");  
                    System.out.println();
                }
              }
         }
        
        ++i; // The incramenting of i to keep the loop going
    }

  }
}

