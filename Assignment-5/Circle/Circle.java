//Travis Davis

public class Circle {
	private double radius;
	private final double pi = Math.PI;

	// constructor
	public Circle(double r) {
		radius = r;
	}

	// no-arg constructor
	public Circle() {
		radius = 1.0;
	}

	// mutator for radius
	public void setRadius(double r) {
		radius = r;
	}

	// accessor for radius
	public double getRadius() {
		return radius;
	}

	// returns diameter
	public double getDiameter() {
		return radius * 2;
	}

	// returns area
	public double getArea() {
		return Math.pow(pi * radius, 2);
	}

	// returns circumference
	public double getCircumference() {
		return (radius * 2) * pi;
	}

}
