package pl.one.radzikowski.shapes;

public class Circle extends Shape {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
		this.type = "Circle";
	}
	
	int getRadius() {
		return radius;
	}

	@Override
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}
