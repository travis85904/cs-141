//Travis Davis

package assignment3;

import javax.swing.JOptionPane;

public class Population {
	static double starting;// declare variables
	static double increase;
	static double days;
	static double population = 0;

	public static void main(String[] args) {
		getStartingNum();// call functions
		getPopIncrease();
		getDays();
		populationCalc();
	}

	public static void getStartingNum() {// get the starting population
		do {
			starting = Double.parseDouble(JOptionPane.showInputDialog("Enter the starting number of organisms"));
			population = starting;
			System.out.println("Day 1: " + population);
		} while (starting < 2);// loop until starting is 2 or more
	}

	public static void getPopIncrease() {// gets the population increase percentage
		do {
			increase = Double.parseDouble(JOptionPane.showInputDialog("Enter the average daily population increase percentage"));
		} while (increase < 0);// loop til positive input is received
	}

	public static void getDays() {// gets the number of days to populate
		do {
			days = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of days"));
		} while (days < 1);// loop til days is 1 or more
	}

	public static void populationCalc() {// calculate and print the population increase
		for (int i = 2; i <= starting; i++) {
			population = (population * (1 + (increase / 100)));
			System.out.println("Day " + i + ": " + population);
		}

	}

}
