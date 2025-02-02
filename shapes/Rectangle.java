// Подсласс TwoDShape для представления прямоугольников
class Rectangle extends TwoDShape {

	// Стандартный конструктор
	Rectangle() {
		super();
	}

	// Конструктор класса Rectangle
	Rectangle(double w, double h) {
		super(w, h, "прямоугольник");
	}

	// Конструктор квадрата
	Rectangle(double x) {
		super(x, "прямоугольник");
	}

	// Конструктор объекта из объкта
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if (getWidth() == getHeight()) return true;
		return false;
	}
	
	// Переопределение метода area() для Rectangle
	double area() {
		return getWidth() * getHeight();
	}
}
