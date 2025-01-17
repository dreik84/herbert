// Подкласс TwoDShape для представления треугольников
class Triangle extends TwoDShape {
	String style;

	double area() {
		return width * height / 2; // члены класса TwoDShapes доступны здесь
	}

	void showStyle() {
		System.out.println("Стиль треугольника: " + style);
	}
}
