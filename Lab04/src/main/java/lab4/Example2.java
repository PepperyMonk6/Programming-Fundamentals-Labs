package lab4;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example2 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// Add the code here
		int[] houses = new int[3];
		houses[0] = 3;
		houses[1] = 0;
		houses[2] = 4;
		
		System.out.println("How many bottles in house 1 is " + houses[0]);
		System.out.println("How many bottles in house 2 is " + houses[1]);
		System.out.println("How many bottles in house 3 is " + houses[2]);
		int totalNumberOfBottles = 0;
		for(int house : houses) {
			System.out.println("How many bottles in house is " + house);
			totalNumberOfBottles += house;
		}
		System.out.println("Total number of bottles " + totalNumberOfBottles);
	}
}
