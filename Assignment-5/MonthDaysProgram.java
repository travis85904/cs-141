
//Travis Davis
import javax.swing.JOptionPane;

public class MonthDaysProgram {
	private static MonthDays date = new MonthDays(month(), year());

	public static void main(String[] args) {
		printDate();
	}

	// print the number of days in the month
	private static void printDate() {
		JOptionPane.showMessageDialog(null, "Days in month: " + date.getNumberOfDays());
	}

	// define month
	private static int month() {
		return Integer.parseInt(JOptionPane.showInputDialog("Enter a month (1-12): "));
	}

	// define year
	public static int year() {
		return Integer.parseInt(JOptionPane.showInputDialog("Enter a year: "));
	}

}
