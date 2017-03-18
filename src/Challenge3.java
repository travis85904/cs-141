
//Travis Davis

import javax.swing.JOptionPane;

public class Challenge3 {
	static String city;
	static String cityUpper;
	static String cityLower;
	static int count;
	static String currentChar;

	public static void main(String[] args) {

		city = JOptionPane.showInputDialog("What is your favorite city?");// prompts
																			// the
																			// user
																			// to
																			// enter
																			// their
																			// favorite
																			// city

		System.out.println(city.length());// prints length of city

		System.out.println(city.toUpperCase());// prints city in upper
												// case
		System.out.println(city.toLowerCase());// prints city in lower
												// case

		char atPos0 = city.charAt(0);// gets the first character in the string
		System.out.print(atPos0);// prints the first character in the string
		char atPos1 = city.charAt(1);// second
		System.out.print(atPos1);
		char atPos2 = city.charAt(2);// third
		System.out.println(atPos2);

	}
}
