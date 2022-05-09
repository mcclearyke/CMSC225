/***************************
* Project 2 - MetalArt
****************************
* This project displays the area and costs of building a model sculpture based 
on user input for the size of the pyramids and rectangular prism
*____________________________
* Kendall McCleary
* Febuary 4th, 2019
* CMSC 255 Section 003
*****/

import java.util.Scanner;
import java.lang.Math;

public class MetalArt {
 public static void printHeading() {
  System.out.println("Kendall McCleary");
  System.out.println("Project 2 - MetalArt");
  System.out.println("This project displays the area and costs of building a model sculpture based on user input for the size of the pyramids and rectangular prism.");
  System.out.println("Febuary 4th, 2019");
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

  		totalCost = totalArea * COST_PER_INCH;

  			System.out.print("The total cost of the material to build " + name + " is $");
  			System.out.printf("%,5.2f", totalCost);
  			System.out.println();

 } 
} 



































