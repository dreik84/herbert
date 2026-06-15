// Использование параметризованного конструктора для инициализации размеров коробки
class BoxDemo7 {
	public static void main(String[] args) {
		
		// Объявить, разместить в памяти и инициализировать объекты Box
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		double vol;

		System.out.println("Volume is " + mybox1.volume());
		System.out.println("Volume is " + mybox2.volume());
	}
}

class Box {
	double width;
	double height;
	double depth;

	Box (double width, double height, double depth) {
		System.out.println("Конструирование " + this);
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double volume() {
		return width * height * depth;
	}

	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
