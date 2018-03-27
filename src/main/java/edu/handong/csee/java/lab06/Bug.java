package edu.handong.csee.java.lab06; // brings the package

import java.util.Scanner; 

public class Bug {

	final static double GROWTH_RATE = 0.95;
	final static double ONE_BUG_VOLUME = 0.002;
	
	
	
	
	
	
	public static void main(String[] args) {

		double houseVolume;
		double startPopulation;
		int countWeeks = 0;
		double population;
		double totalBugVolume;
		double newBugs;
		// double BugVolume;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the total volume of your house\nin cubic feet: ");
		houseVolume = keyboard.nextDouble();

		System.out.print("Enter the estimated number of \nroaches in your house: ");
		startPopulation = keyboard.nextDouble();
		
		population = startPopulation;
		totalBugVolume = population*ONE_BUG_VOLUME;
		
		
		while(totalBugVolume < houseVolume) {
			
			newBugs = population * GROWTH_RATE;
			population+=newBugs;
			totalBugVolume = population * ONE_BUG_VOLUME;
			
			countWeeks++;
		}
		
		System.out.printf("Starting with a roach population of %.0f \nand a house with a volume of %.1f cubic feet,\nafter %d weeks, \n", startPopulation, houseVolume, countWeeks);
		System.out.printf("the house will be filled with %d roaches. \n", (int)population);
		System.out.printf("They will fill a volume of %.0f cubic feet. \n", totalBugVolume);
		System.out.printf("Better call Debugging Experts Inc.");
		
	}

}
