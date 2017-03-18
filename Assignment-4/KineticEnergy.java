
//Travis Davis
import javax.swing.JOptionPane;

public class KineticEnergy {
	// initialize variables
	static double ke, m, v;

	public static void main(String[] args) {
		getInput();
		// call calcKineticEnergy(m, v) and print the result
		JOptionPane.showMessageDialog(null, "The object's kinetic energy is " + calcKineticEnergy(m, v));
	}

	public static void getInput() {
		// define variables
		m = Double.parseDouble(JOptionPane.showInputDialog("Enter the object's mass in kilograms"));
		v = Double.parseDouble(JOptionPane.showInputDialog("Enter the object's velocity in meters per second"));
	}

	public static double calcKineticEnergy(double m, double v) {
		// calculate kinetic energy
		double x = (0.5) * (Math.pow(m * v, 2));
		return x;
	}

}
