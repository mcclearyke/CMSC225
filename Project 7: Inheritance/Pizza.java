import java.io.IOException;
import java.util.Scanner;

public class potl {
	
	public void main(String[] args) {

			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter a String: ");
			String string = in.next();
			
			System.out.print(getFirstMiddleLast(string));
	
	}
	
public String getFirstMiddleLast(String string) {
		
		int startIndex = 0;
		int endIndex = 0;
		String firstChar = "";
		String middleChar = "";
		String lastChar = "";
		String fmlChar = "";
		
		
		try {
		
		/************
		finding FIRST
		*************/
		firstChar = string.substring(0, 1);
		
		/**************
		finding MIDDLE
		***************/
		
		//if the String length is 2
		if (string.length() == 2) {
			
			throw new IOException("There's no middle character!");
		}
		
		//EVEN string length
		else if (string.length() % 2 == 0) {
			
			startIndex = (string.length() / 2) - 1;//will find the position/number of the middle value
			endIndex = (string.length() / 2) + 1; //(endIndex - 1) the position/number of the last read element in the String
		}
		
		//ODD string length
		else {
			
			startIndex = string.length() / 2;     //will find the position/number of the middle value
			endIndex = (string.length() / 2) + 1; //(endIndex - 1) the position/number of the last read element in the String
		}
		
		//need to put an end index so that it doesn't return the full String staring from the middle
		middleChar = string.substring(startIndex, endIndex);
		
		/***********
		finding LAST
		************/
		int firstIndex = string.length() - 1;
		int lastIndex = string.length();
		
		lastChar = string.substring(firstIndex, lastIndex);
	
		fmlChar = firstChar + middleChar + lastChar;
	}
		
	catch(IOException ex) {
			
		System.out.print("String is out of bounds");
	}
		
		return fmlChar;
	}

}
