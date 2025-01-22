// Класс для представления двумерных объектов
class TwoDShape {
	private double width;   // теперь это
	private double height;  // закрытые члены
	
	// Параметризованный конструктор
	TwoDShape(double w, double h) {
		width = w;
		height = h;
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
