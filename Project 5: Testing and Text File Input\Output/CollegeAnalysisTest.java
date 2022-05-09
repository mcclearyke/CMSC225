import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollegeAnalysisTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	public File generateGivenInputFile() throws IOException {
		final String INPUT_FILENAME = "foo.txt";
		File inputFile = folder.newFile(INPUT_FILENAME);
		PrintWriter write = new PrintWriter(inputFile);
		write.print("Heading\n" + 
				"College of William and Mary	6245	0.591	0.0708	0.091	0.0788	0.0016	0.0002	0.0469	0.0597	0.06	\n" + 
				"Christopher Newport University	4921	0.747	0.0764	0.048	0.0264	0.0043	0.0008	0.0471	0.0039	0.0461	\n" + 
				"Emory & Henry College	1004	0.761	0.0936	0.0458	0.011	0.005	0.001	0.0189	0.008	0.0558	\n" + 
				"Ferrum College	1289	0.4942	0.3445	0.0551	0.0039	0.0085	0.0008	0.0628	0.0062	0.024	\n" + 
				"George Mason University	23179	0.4291	0.1092	0.1375	0.1944	0.0019	0.0041	0.0455	0.0486	0.0298	\n" + 
				"Hampden-Sydney College	1027	0.8403	0.0467	0.037	0.0088	0.0039	0.0019	0.0351	0.0058	0.0204	\n" + 
				"Hampton University	3793	0.0129	0.9549	0.0119	0.0024	0.0026	0.0005	0	0.0148	0	\n" + 
				"Hollins University	655	0.6504	0.1206	0.0611	0.0214	0.0107	0.0015	0.0519	0.0473	0.0351	\n" + 
				"James Madison University	19262	0.7537	0.0459	0.0622	0.046	0.0012	0.0012	0.0402	0.0213	0.0281	\n" + 
				"Liberty University	46680	0.4766	0.114	0.0498	0.0102	0.0045	0.0016	0.0196	0.0158	0.3078	\n" + 
				"Longwood University	4326	0.7534	0.095	0.0458	0.0109	0.0037	0.0007	0.0356	0.0143	0.0407	\n" + 
				"Mary Baldwin University	1226	0.5489	0.2357	0.071	0.0212	0.0098	0.0033	0.0383	0.0212	0.0506	\n" + 
				"University of Mary Washington	4318	0.7043	0.072	0.0787	0.0377	0.0025	0.0009	0.0509	0.0093	0.0435	\n" + 
				"Norfolk State University	4707	0.0395	0.8489	0.0336	0.0051	0.0021	0.0008	0.0425	0.0045	0.0229	\n" + 
				"Old Dominion University	19606	0.4625	0.2909	0.0842	0.0445	0.0034	0.0029	0.066	0.0145	0.0312	\n" + 
				"Radford University	8426	0.6933	0.1521	0.07	0.0146	0.0023	0.0017	0.0493	0.008	0.0088	\n" + 
				"Randolph-Macon College	1429	0.7845	0.0847	0.0427	0.0224	0.0035	0.0014	0.0378	0.0161	0.007	\n" + 
				"Randolph College	649	0.6949	0.1279	0.0555	0.0169	0.0015	0.0031	0.0447	0.0555	0	\n" + 
				"University of Richmond	3229	0.5943	0.07	0.0749	0.0712	0.0025	0	0.0412	0.0845	0.0613	\n" + 
				"Roanoke College	1946	0.8222	0.056	0.0432	0.0128	0.0031	0.0005	0.036	0.0257	0.0005	\n" + 
				"Sweet Briar College	320	0.7094	0.1	0.1	0.0188	0.0031	0.0031	0.0406	0.0188	0.0063	\n" + 
				"Virginia Polytechnic Institute and State University	25725	0.6654	0.0397	0.0596	0.0999	0.0017	0.0012	0.0449	0.0583	0.0293	\n" + 
				"Virginia Commonwealth University	22614	0.4827	0.1892	0.0879	0.1291	0.0025	0.0014	0.0587	0.0348	0.0138	\n" + 
				"University of Virginia-Main Campus	15963	0.5929	0.065	0.0635	0.1302	0.0011	0.0005	0.0445	0.0453	0.0571	\n" + 
				"Virginia Military Institute	1713	0.7992	0.0607	0.0584	0.042	0.0058	0.0041	0.0134	0.0158	0.0006	\n" + 
				"Virginia State University	4155	0.0161	0.6082	0.014	0.0051	0.0031	0	0	0.0024	0.3511	\n" + 
				"Virginia Union University	1355	0.0133	0.9306	0.0207	0	0.0044	0.0037	0	0.0022	0.0251	\n" + 
				"Virginia Wesleyan University	1342	0.5067	0.2534	0.0827	0.0127	0.0104	0.0015	0.0626	0.0075	0.0626	\n" + 
				"Washington and Lee University	1820	0.8308	0.0192	0.0368	0.0324	0	0	0.0324	0.039	0.0093	");
		write.close();
		return inputFile;
	}
	
	@Test
	public void givenDataFileLine1Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		actual = scan.nextLine();
		expected = "The institution with the highest White population is: Hampden-Sydney College and the average is: 0.57";
		assertEquals("Line 1, White percentage, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine2Test() throws IOException {
		
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Black/African American population is: Hampton University and the average is: 0.22";
		assertEquals("Line 2, Black/African American percentage, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine3Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();
		scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Hispanic population is: George Mason University and the average is: 0.06";
		assertEquals("Line 3, Hispanic percentage, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine4Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();
		scan.nextLine();
		scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Asian population is: George Mason University and the average is: 0.04";
		assertEquals("Line 4, Asian percentage, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine5Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest American Indian or Alaska Native population is: Hollins University and the average is: 0.00";
		assertEquals("Line 5, American Indian or Alaska Native percentage, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine6Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Native Hawaiian or Other Pacific Islander population is: George Mason University and the average is: 0.00";
		assertEquals("Line 6, Native Hawaiian or Other Pacific Islander percentages, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine7Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Two or More Category population is: Old Dominion University and the average is: 0.04";
		assertEquals("Line 6, Two or More percentages, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine8Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Non-resident Alien population is: University of Richmond and the average is: 0.02";
		assertEquals("Line 6, Non-resident Alien percentages, is incorrect. we", expected, actual);
		scan.close();
	}
	@Test
	public void givenDataFileLine9Test() throws IOException {
		final String OUTPUT_FILENAME = "output.txt";
		// Create input and output files and populate input file
		File outputFile = folder.newFile(OUTPUT_FILENAME);
		// Invoke method
		CollegeAnalysis.parseData(generateGivenInputFile(), outputFile, 29);
		// Check results
		assertTrue("Output file does not exist", outputFile.exists());
		String actual, expected;
		Scanner scan = new Scanner(outputFile);
		scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();scan.nextLine();
		actual = scan.nextLine();
		expected = "The institution with the highest Unknown Category population is: Virginia State University and the average is: 0.05";
		assertEquals("Line 6, Unknown Category percentages, is incorrect. we", expected, actual);
		scan.close();
	}
	
	

	@Test
	public void testFindHighest() {
		String[] inst = {"College of William and Mary", "Christopher Newport University", "Emory & Henry College", "Ferrum College", "George Mason University", "Hampden-Sydney College", "Hampton University", "Hollins University", "James Madison University", "Liberty University", "Longwood University", "Mary Baldwin University", "University of Mary Washington", "Norfolk State University", "Old Dominion University", "Radford University", "Randolph-Macon College", "Randolph College", "University of Richmond", "Roanoke College", "Sweet Briar College", "Virginia Polytechnic Institute and State University", "Virginia Commonwealth University", "University of Virginia-Main Campus", "Virginia Military Institute", "Virginia State University", "Virginia Union University", "Virginia Wesleyan University", "Washington and Lee University"};
		double[] hisp = {0.091, 0.048, 0.0458, 0.0551, 0.1375, 0.037, 0.0119, 0.0611, 0.0622, 0.0498, 0.0458, 0.071, 0.0787, 0.0336, 0.0842, 0.07, 0.0427, 0.0555, 0.0749, 0.0432, 0.1, 0.0596, 0.0879, 0.0635, 0.0584, 0.014, 0.0207, 0.0827, 0.0368};
		CollegeAnalysis.findHighest(inst, hisp);
		assertEquals("We", "George Mason University", CollegeAnalysis.findHighest(inst, hisp));
	}
	
	@Test
	public void testFindAverage() {
		double result = CollegeAnalysis.findAverage(new double[] {3,6,9,12});
		assertEquals("We",7.5,result,.0001);
	}

}
