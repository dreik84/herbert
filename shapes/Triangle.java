// Подкласс TwoDShape для представления треугольников
class Triangle extends TwoDShape {
	private String style;

	// Стандартный конструктор
	Triangle() {
		super();
		style = "отсутствует";
	}

	// Конструктор
	Triangle(String s, double w, double h) {
		super(w, h, "треугольник"); // вызов конструктора суперкласса
		style = s;
	}

	// Конструктор с одним аргуметом
	Triangle(double x) {
		super(x, "треугольник");
		style = "закрашенный";
	}

	// Конструктор объекта из объкта
	Triangle(Triangle ob) {
		super(ob);  // передача объекта конструктору класса TwoDShape
		style = ob.style;
	}
	
	// Переопределение метода area() для Triangle
	double area() {
		return getWidth() * getHeight() / 2; // доступ через геттеры
	}

	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}
}
