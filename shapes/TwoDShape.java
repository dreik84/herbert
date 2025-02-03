// Класс для представления двумерных объектов
abstract class TwoDShape {

	private double width;   // теперь это
	private double height;  // закрытые члены
	private String name;
	
	// Стандартный конструктор
	TwoDShape() {
		width = height = 0.0;
		name = "без имени";
	}

	// Параметризованный конструктор
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	// Конструктор объкта с одинаковой шириной и высотой
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}

	// Конструктор объекта из объекта
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// Методы доступа для width и height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }
	String getName() { return name; }

	void showDim() {
		System.out.println("Ширина и высота: " + width + " и " + height);
	}
	
	// Теперь этот метод абстрактный
	abstract double area();
}
