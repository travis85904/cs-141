
//Travis Davis

import javax.swing.JOptionPane;

public class bankCharges {

	public static void main(String[] args) {
		Integer numChecks = Integer.parseInt(JOptionPane.showInputDialog("How many checks did you write this month?"));// gets number of checks
		if (numChecks >= 60) {
			JOptionPane.showMessageDialog(null, "Bank fees $" + ((numChecks * .04) + 10));// fees for 60+ checks
		} else if (numChecks >= 40) {
			JOptionPane.showMessageDialog(null, "Bank fees $" + ((numChecks * .06) + 10));// fees for 40-59 checks
		} else if (numChecks >= 20) {
			JOptionPane.showMessageDialog(null, "Bank fees $" + ((numChecks * .08) + 10));// fees for 20-39 checks
		} else
			JOptionPane.showMessageDialog(null, "Bank fees $" + ((numChecks * .1) + 10));// fees for less than 20 checks
	}

}
