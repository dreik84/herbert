// Использование полиморфизма во время выполнения

class FindAreas {
	public static void main(String[] args) {
		
		Figure f = new Figure(10, 10);
		Figure r = new Rectangle(9, 5);
		Figure t = new Triangle(10, 8);

		System.out.println("Area: " + f.area());
		System.out.println("Area: " + r.area());
		System.out.println("Area: " + t.area());
	}
}

class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	double area() {
		System.out.println("area figure");
		return 0;
	}
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("area rectangle");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		System.out.println("area triangle");
		return dim1 * dim2 / 2;
	}
}
