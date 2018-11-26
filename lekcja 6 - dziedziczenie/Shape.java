package pl.one.radzikowski.shapes;

abstract class Shape {
	String type;
	abstract double getPerimeter();
	abstract double getArea();

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Object \"" + getType() + "\""
				+ "\n- perimeter: " + getPerimeter()
				+ "\n- area: " + getArea() + "\n";
	}

}
