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
		super(w, h); // вызов конструктора суперкласса

		style = s;
	}

	// Конструктор с одним аргуметом
	Triangle(double x) {
		super(x);
		style = "закрашенный";
	}

	double area() {
		return getWidth() * getHeight() / 2; // доступ через геттеры
	}

	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}
}
