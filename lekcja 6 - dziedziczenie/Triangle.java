package pl.one.radzikowski.shapes;

public class Triangle extends Shape {
	int side;

	public Triangle(int a) {
		side = a;
		type = "Triangle";
	}

	@Override
	double getPerimeter() {
		return 3 * side;
	}

	@Override
	double getArea() {
		return side * side * Math.sqrt(3) / 4;
	}
}
