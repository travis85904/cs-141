
//Travis Davis

import javax.swing.JOptionPane;

public class timeCalculator {

	public static void main(String[] args) {

		Double seconds = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of seconds"));// gets user input of seconds
		if (seconds >= 86400) {
			JOptionPane.showMessageDialog(null, (seconds / 86400) + " days");// calculates and displays days
		} else if (seconds >= 3600) {
			JOptionPane.showMessageDialog(null, (seconds / 3600) + " hours");// if less than 1 day, displays hours
		} else if (seconds >= 60) {
			JOptionPane.showMessageDialog(null, seconds + " seconds");// if less than 1 hour, displays seconds
		}

	}
}
