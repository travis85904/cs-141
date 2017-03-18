
//Travis Davis
import java.text.DecimalFormat;

public class FallingDistance {
	// force 2 decimals
	static DecimalFormat decim = new DecimalFormat("#,##0.00");

	public static void main(String[] args) {
		// call fallingDistance(t) and print falling distance
		for (int i = 1; i < 11; i++) {
			System.out.println("The object has fallen " + decim.format(fallingDistance(i)) + " in " + i + " seconds");
		}
	}

	// calculate falling distance
	public static double fallingDistance(double t) {
		double m = .5 * (9.8 * (t * t));
		return m;
	}
}
