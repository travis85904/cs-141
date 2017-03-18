
//Travis Davis

import javax.swing.JOptionPane;

public class magicDates {

	public static void main(String[] args) {

		Integer day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day  as DD"));// gets date from user
		Integer month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month as MM"));
		Integer year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year as YY"));

		if (day * month == year) {// checks if the date is magic
			JOptionPane.showMessageDialog(null, "The date is magic!");
		} else
			JOptionPane.showMessageDialog(null, "Sorry, the date is not magic");

	}
}
