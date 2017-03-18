
//Travis Davis
import java.util.Scanner;

public class CircleProgram {
	// initializing variables
	private static double radius;
	private static Scanner scanner = new Scanner(System.in);
	private static Circle myCircle = new Circle();
	private static Circle noArg = new Circle();

	public static void main(String[] args) {

		// gets user input for radius
		System.out.print("Enter Radius: ");
		radius = scanner.nextDouble();

		// make a new instance of Circle()
		myCircle = new Circle(radius);

		// calculate circle and print
		System.out.println("Area: " + myCircle.getArea());
		System.out.println("Area: " + myCircle.getArea());
		System.out.println("Diameter: " + myCircle.getDiameter());
		System.out.println("Circumference: " + myCircle.getCircumference());
		System.out.println("\n\nArea: " + noArg.getArea());
		System.out.println("Diameter: " + noArg.getDiameter());
		System.out.println("Circumference: " + noArg.getCircumference());
	}

}
