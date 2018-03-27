package edu.handong.csee.java.lab06; // brings the package

import java.util.Scanner; ; // gets the Scanner class from the package (libarary) java.util


/**
 * This class defines to get the number of weeks which bugs fill the house completely. </br>
 * First declares growthrate, onebugvolume as final static members.</br>
 * it has main methods which has all the members and execute while loop to get the number of weeks to fill the house. </br>
 * @author HAN
 */
public class Bug { // its a class which can access from other package

	final static double GROWTH_RATE = 0.95; // declares final static member of grwothrate
	final static double ONE_BUG_VOLUME = 0.002; // declare final static member of onebugvolume;
		
	/**
	 * This main method declares six input values. </br>
	 * it declares the scanner keyboard which comes from import statement at the beginning.</br>
	 * gets two user input values from users and stores them into housevolume and start population members. </br>
	 * To execute while loop and executes untill the condition is unsatisfied and terminates to get the final number of weeks to fill the house. </br>  
	 * @author HAN
	 */
	public static void main(String[] args) { // a void method, invoked by the system

		double houseVolume; // the target volume to be filled with bug, given by user
		double startPopulation; // initial value given by user
		int countWeeks = 0; // first initialized with zero and will have final weeks which takes time to fill the house.
		double population; // member declared to get the bug population to get the volume
		double totalBugVolume; // member declared to get the totalvolumebug.
		double newBugs; // member declared which helps to get the new population.
	
		
		Scanner keyboard = new Scanner(System.in); // sets up things so the program can accept keyboard input.
		
		System.out.print("Enter the total volume of your house\nin cubic feet: "); // asks user to put housevol value
		houseVolume = keyboard.nextDouble(); // stores user value in housevolume member.

		System.out.print("Enter the estimated number of \nroaches in your house: "); // asks user to put startpopulation value 
		startPopulation = keyboard.nextDouble(); // stores user value in startpopulation member.
		
		population = startPopulation; // initial population value is the user input value
		totalBugVolume = population*ONE_BUG_VOLUME; // as well as initial value is the user value
		
		
		while(totalBugVolume < houseVolume) { // executes while loop, check condition is true of false
			
			newBugs = population * GROWTH_RATE; // stores new population 
			population+=newBugs; // stores new population in population member
			totalBugVolume = population * ONE_BUG_VOLUME; // gets new volume of bugs
			
			countWeeks++; // gets one more week if while loop executes again
		}
		
		System.out.printf("Starting with a roach population of %.0f \nand a house with a volume of %.1f cubic feet,\nafter %d weeks, \n", startPopulation, houseVolume, countWeeks); // prints user input values, and final countweeks
		System.out.printf("the house will be filled with %d roaches. \n", (int)population); // prints final population, double type is changed to int by using (int)
		System.out.printf("They will fill a volume of %.0f cubic feet. \n", totalBugVolume); // prints final bugvolume, double type is not changed but prints 0 decimal which looks like integers.
		System.out.printf("Better call Debugging Experts Inc."); // prints the result output screen.
		
	}

}
