
//Travis Davis
import javax.swing.JOptionPane;

public class StockProfit {
	// declare variables
	static double result;
	static double ns, pp, pc, sp, sc = 9;

	public static void main(String[] args) {
		getInput();
		result = profitCalc(ns, pp, pc, sp, sc);
		displayResult();
	}

	// gets user input to define variables
	public static void getInput() {
		ns = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of shares"));
		pp = Double.parseDouble(JOptionPane.showInputDialog("Enter the purchase price per share"));
		pc = Double.parseDouble(JOptionPane.showInputDialog("Enter the purchase commission paid"));
		sp = Double.parseDouble(JOptionPane.showInputDialog("Enter the sale price per share"));
		sc = Double.parseDouble(JOptionPane.showInputDialog("Enter the sale commission paid"));
	}

	// calculate profit
	public static double profitCalc(double ns, double pp, double pc, double sp, double sc) {
		double x = ((ns * sp) - sc) - ((ns * pp) + pc);
		return x;
	}

	// determine loss or gain and display to user
	public static void displayResult() {
		if (result > 0) {
			JOptionPane.showMessageDialog(null, "You made a profit! Your profit was $" + result);
		} else if (result < 0) {
			JOptionPane.showMessageDialog(null, "You had a loss! You lost $" + Math.abs(result));
		} else if (result == 0) {
			JOptionPane.showMessageDialog(null, "You broke even!");
		}
	}
}
