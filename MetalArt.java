/******
* Project 2 - MetalArt
****************************
* This project displayes the area and costs of building a model sculpture based 
on user input for the size of the pyramids and rectangulare prism
*____________________________
* Kendall McCleary
* Febuary 3rd, 2019
* CMSC 255 Section 003
*****/

import java.util.Scanner;
import java.lang.Math;

public class MetalArt {
 public static void printHeading() {
  System.out.println("Kendall McCleary");
  System.out.println("Project 2 - MetalArt");
  System.out.println("This project displayes the area and costs of building a model sculpture based on user input for the size of the pyramids and rectangulare prism");
  System.out.println("Febuary 3rd, 2019");
  System.out.println("CMSC 255 Section 003");
  System.out.println();
 }
 
 public static void main(String [] args) {
    printHeading();

  		Scanner in = new Scanner(System.in);

  		String name; // input for name

  		double baseLength1; // value for FIRST pyramid
  		double heightLength1; // value for FIRST pyramid
  		
  		double baseLength2; // value for SECOND pyramid
  		double heightLength2; // value for SECOND pyramif
  		
  		double heightPrism; // value for rectangular prism
  		double lengthPrism; // value for rectangular prism
  		double widthPrism; // value for rectangular prism
 
  	// input the name

  		System.out.print("Enter the name of the pyramid: ");
  			name = in.nextLine();
  		

  	// input the vales of the first pyramid

  		// input the length of the FIRST pyramid

  		System.out.print("Enter the length of the base of the first pyramid (inches): "); // length
  			baseLength1 = in.nextInt();

  		// input the height of the FIRST pyramid

  		System.out.print("Enter the height of the first pyramid (inches): "); // height
  			heightLength1 = in.nextInt();

  		
  	// input the values of the second pyramid

  		// input the length of the SECOND pyramid

  		System.out.print("Enter the length of the base of the second pyramid (inches): "); // length
  			baseLength2 = in.nextInt();

  		// input the height of the SECOND pyramid

  		System.out.print("Enter the height of the second pyramid (inches): "); // height
  			heightLength2 = in.nextInt();


  	// input values of the rectangular prism

  		// input the height 

  		System.out.print("Enter the height of the rectangular prism (inches): "); // height
  			heightPrism = in.nextInt();

  		// input the length

  		System.out.print("Enter the length of the rectangular prism (inches): "); // length
  			lengthPrism = in.nextInt();

  		// input the width 

  		System.out.print("Enter the width of the rectangular prism (inches): "); // width
  			widthPrism = in.nextInt();

  		/******************************************************************
  		Time for Calculations:
		
			Surface Area for the Triangular Pyramids: 
			
  			areaPyramid = B + (1/2) * (3*b*l);

  			areaBase = (1/2) * b * Math.sqrt(Math.pow(b,2) - Math.pow(((1/2) * b), 2));

  			slantLength = Math.sqrt(Math.pow(((1/2) * b),2) + Math.pow(h,2));
		******************************************************************/

		// Starting the Calculations

		System.out.println("The " + name + " surface area calculations are: ");

		// Stating the variables needed to do the calculations

		double areaBase1;
		double areaBase2;
		double slantLength1;
		double slantLength2;
		double areaPyramid1;
		double areaPyramid2;
		double areaPrism;
		double totalArea;
		double totalCost;
		final double COST_PER_INCH = 1.67;

		// finding the surface area of the FIRST pyramid

  		areaBase1 = 0.5 * baseLength1 * Math.sqrt(Math.pow(baseLength1, 2) - Math.pow(0.5 * baseLength1, 2)); // Finding B - the area of the base of the triangle

  		slantLength1 = Math.sqrt((Math.pow(0.5 * baseLength1, 2)) + (Math.pow(heightLength1, 2))); // Finding l - the slant length

  		areaPyramid1 = areaBase1 + 0.5 * (3 * baseLength1 * slantLength1); // Finding Surface Area of the triangular pyramid
  			
  			System.out.print("Surface area of the first pyramid: ");
  			System.out.printf("%5.2f", areaPyramid1);
  			System.out.print(" square inches");
  			System.out.println();


  		// finding the surface area of the SECOND pyramid

  		areaBase2 = 0.5 * baseLength2 * Math.sqrt(Math.pow(baseLength2, 2) - Math.pow(0.5 * baseLength2, 2)); // Finding B - the area of the base of the triangle

  		slantLength2 = Math.sqrt((Math.pow(0.5 * baseLength2, 2)) + (Math.pow(heightLength2, 2))); // Finding l - the slant length

  		areaPyramid2 = areaBase2 + 0.5 * (3 * baseLength2 * slantLength2); // Finding Surface Area of the triangular pyramid
  			
  			System.out.print("Surface area of the second pyramid: ");
  			System.out.printf("%5.2f", areaPyramid2);
  			System.out.print(" square inches");
  			System.out.println();

  		// finding the surface area of the Rectangular Prism
  		// surface area = 2lw + 2lh + 2wh

  		areaPrism = (2 * lengthPrism * widthPrism) + (2 * lengthPrism * heightPrism) + (2 * widthPrism * heightPrism); // finding the Surface Area of the rectangular prism

  			System.out.print("Surface area of the Rectangular Prism: ");
  			System.out.printf("%,5.2f", areaPrism);
  			System.out.print(" square inches");
  			System.out.println();

  		// finding Total Surface Area
  		// Total SA = areaPyramid1 + areaPyramid2 + areaPrism

  		totalArea = areaPyramid1 + areaPyramid2 + areaPrism;

  			System.out.print("Total Surface area: "); 
  			System.out.printf("%,5.2f", totalArea);
  			System.out.print(" square inches");
  			System.out.println();

  		// claculating the Total Cost

  		totalCost = totalArea * COST_PER_INCH;

  			System.out.print("The total cost of the material to build " + name + " is $");
  			System.out.printf("%,5.2f", totalCost);
  			System.out.println();

 } 
} 



































