// Подсласс TwoDShape для представления прямоугольников
class Rectangle extends TwoDShape {
	
	boolean isSquare() {
		if (width == height) return true;
		return false;
	}

	double area() {
		return width * height;
	}
}
