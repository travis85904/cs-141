//Travis Davis

package assignment3;

import javax.swing.JOptionPane;

public class PenniesForPay {
	static Double pennies;
	static Double days;
	static Double total = 0.0;

	public static void main(String[] args) {
		getDays();
		// getPay();
	}

	public static Double getDays() {// get the number of days
		days = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of days: "));
		return days;

	}

	public static void getPay(double days) {// calculates pay and creates a table
		System.out.println("Day\t\tPay");
		for (double i = 1; i < (days + 1); i++) {
			total += pennies;
			pennies = (Math.pow(2, i)) / 100;
			System.out.println(i + "\t\t" + pennies);

		}
		// System.out.println("Total pay: " + total);
	}

}
