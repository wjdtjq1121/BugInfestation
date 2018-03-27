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
		
		System.out.print("Enter the house volume");
		houseVolume = keyboard.nextDouble();

		System.out.print("Enter the initial value of roaches");
		startPopulation = keyboard.nextInt();
		
		population = startPopulation;
		totalBugVolume = population*ONE_BUG_VOLUME;
		
		
		while(totalBugVolume < houseVolume) {
			
			newBugs = population * GROWTH_RATE;
			population+=newBugs;
			totalBugVolume = population * ONE_BUG_VOLUME;
			
			countWeeks++;
		}
		
		System.out.printf("result value. countweeks: %d, totalBug: %f, population: %f", countWeeks, totalBugVolume, population);
		
		
		
	}

}
