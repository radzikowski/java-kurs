package pl.one.radzikowski.shapes;

public class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(double a, double b) {
		length = a;
		width = b;
		type = "Rectangle";
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}

	@Override
	double getPerimeter() {
		return 2 * length + 2 * width;
	}

	@Override
	double getArea() {
		return length * width;
	}

}
