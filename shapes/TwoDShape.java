// Класс для представления двумерных объектов
class TwoDShape {
	private double width;   // теперь это
	private double height;  // закрытые члены
	
	// Стандартный конструктор
	TwoDShape() {
		width = height = 0.0;
	}

	// Параметризованный конструктор
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// Конструктор объкта с одинаковой шириной и высотой
	TwoDShape(double x) {
		width = height = x;
	}

	// Конструктор объекта из объекта
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
	}
	
	// Методы доступа для width и height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }

	void showDim() {
		System.out.println("Ширина и высота: " + width + " и " + height);
	}
}
