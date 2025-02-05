// Подсласс TwoDShape для представления окружности
class Circle extends TwoDShape {
	private double radius = 0;

	// Стандартный конструктор
	Circle() {
		super();
	}

	// Конструктор класса Circle
	Circle(double r) {
		super();
		radius = r;
	}

	// Конструктор объекта из объкта
	Circle(Circle ob) {
		super(ob);
	}
	
	// Переопределение метода area() для Circle
	double area() {
		return Math.PI * radius * radius;
	}
}
