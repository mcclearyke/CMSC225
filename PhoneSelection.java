/***************************
* Lab 5 - Selection
****************************
* This lab we made a java program that takes a single letter and displays the corresponding digit on the telephone.
*____________________________
* Kendall McCleary and Danny Bui
* Febuary 13th, 2019
* CMSC 255 Section 003
*****/

import java.util.Scanner;

	public class PhoneSelection {
		public static void main(String [] args) {
		
			Scanner in = new Scanner(System.in);

		// Have the user input a letter
		System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone: ");
		char letter = in.next().toUpperCase().charAt(0);


		 // Enter inputs for the digit 2
		if ((letter == 'A') || (letter == 'B') || (letter == 'C')) {
			System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone");
		}

		// Enter inputs for the digit 3
		else if ((letter == 'D') || (letter == 'E') || (letter == 'F')) {
			System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone");
		}

		// Enter inputs for the digit 4
		else if ((letter == 'G') || (letter == 'H') || (letter == 'I')) {
			System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone");
		}

		// Enter inputs for the digit 5
		else if ((letter == 'J') || (letter == 'K') || (letter == 'L')) {
			System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone");
		}

		// Enter inputs for the digit 6
		else if ((letter == 'M') || (letter == 'N') || (letter == 'O')) {
			System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone");
		}

		// Enter inputs for the digit 7
		else if ((letter == 'P') || (letter == 'Q') || (letter == 'R') || (letter == 'S')) {
		}
			System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone");

		// Enter inputs for the digit 8
		else if ((letter == 'T') || (letter == 'U') || (letter == 'V')) {
			System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone");
		}

		// Enter inputs for the digit 9
		else if ((letter == 'W') || (letter == 'X') || (letter == 'Y') || (letter == 'Z')) {
			System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone");
		}
		// If the user doesn't enter a valid letter
		else {
			System.out.println("Error, please input a valid letter!");
		}
	}

}


