// Использование конструктора для инициализации размеров коробки
class BoxDemo6 {
	public static void main(String[] args) {
		
		// Объявить, разместить в памяти и инициализировать объекты Box
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		System.out.println("Volume is " + mybox1.volume());
		System.out.println("Volume is " + mybox2.volume());
	}
}

class Box {
	double width;
	double height;
	double depth;

	Box () {
		System.out.println("Конструирование " + this);
		width = 10;
		height = 10;
		depth = 10;
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
