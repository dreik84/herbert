// Перегрузка конструктора

class OverloadCons {
	public static void main(String[] args) {
		
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mycube = new Box(7);
		double vol;

		vol = mybox1.volume();
		System.out.println("Объем mybox1 равен " + vol);

		vol = mybox2.volume();
                System.out.println("Объем mybox2 равен " + vol);

		vol = mycube.volume();
                System.out.println("Объем mycube равен " + vol);
	}
}

class Box {
	
	double width;
	double height;
	double depth;

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box() {
		width = height = depth = -1;
	}

	Box(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}
}
