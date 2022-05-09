import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WeeklyPayrollTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	public File generateGivenInputFile() throws IOException {
		final String INPUT_FILENAME = "foo.txt";
		File inputFile = folder.newFile(INPUT_FILENAME);
		PrintWriter write = new PrintWriter(inputFile);
		write.print("Cindy Li 2 4 3 4 5 8 8\n" +
				"Sue Um 7 3 4 3 3 4 4\n" +
				"Cal Ro 3 3 4 3 3 2 2\n" +
				"Will Gu 9 3 4 7 3 4 1\n" +
				"Ben Yup 3 5 4 3 6 3 8\n" +
				"Pat Qui 3 4 4 6 3 4 4\n" +
				"Ed Han 3 7 4 8 3 8 4\n" +
				"Tim Nim 6 3 5 9 2 7 9\n");
		write.close();
		return inputFile;
	}
	
	@Test
	public void givenDataFileLine1Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "CindyLi323.00";
		assertEquals("Line 1, Cindy Li, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine2Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "SueUm266.00";
		assertEquals("Line 2, Sue Um, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine3Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "CalRo190.00";
		assertEquals("Line 3, Cal Ro, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine4Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "WillGu294.50";
		assertEquals("Line 4, Will Gu, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine5Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "BenYup304.00";
		assertEquals("Line 5, Ben Yup, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine6Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "PatQui266.00";
		assertEquals("Line 6, Pat Qui, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine7Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "EdHan351.50";
		assertEquals("Line 7, Ed Han, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine8Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "TimNim389.50";
		assertEquals("Line 8, Tim Nim, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine10Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Monday36";
		assertEquals("Line 10, Monday, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine11Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Tuesday32";
		assertEquals("Line 10, Tuesday, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine12Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Wednesday32";
		assertEquals("Line 10, Wednesday, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine13Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Thursday43";
		assertEquals("Line 10, Thursday, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine14Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Friday28";
		assertEquals("Line 10, Friday, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine15Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Saturday40";
		assertEquals("Line 10, Saturday, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine16Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		WeeklyPayroll.parseData(generateGivenInputFile(), outputFile, 8);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		String[] result = actual.split("\\s");
		actual = "";
		for(int i = 0; i<result.length; i++) {
			actual += result[i];
		}
		expected = "Sunday40";
		assertEquals("Line 10, Sunday, is incorrect. we", expected, actual);
		scan.close();
	}
	
	@Test
	public void testCalcGrossPay() {
		int[][] hours = {{1, 2, 3, 4, 5, 6, 7}, {2, 3, 4, 5, 6, 7, 8}, {5, 6, 7, 8, 9, 10, 11}};
		double[] result = WeeklyPayroll.calcGrossPay(hours);
		assertEquals("We", Arrays.toString(new double[] {266.0,332.5,532.0}), Arrays.toString(result));
	}
	
	@Test
	public void testCalcDayTally() {
		int[][] hours = {{1, 2, 3, 4, 5, 6, 7}, {2, 3, 4, 5, 6, 8, 9}, {5, 6, 7, 8, 9, 10, 11}};
		int[] result = WeeklyPayroll.calcDayTally(hours);
		assertEquals("We",Arrays.toString(new int[] {8, 11, 14, 17, 20, 24, 27}),Arrays.toString(result));
	}

}
