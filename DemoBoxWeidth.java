// Наследование для расширения класса Box
class DemoBoxWeight {
	public static void main(String[] args) {
		
		// Объявить, разместить в памяти и инициализировать объекты Box
		BoxWeidth mybox1 = new BoxWeidth(10, 20, 15, 34.3);
		Box mybox2 = new BoxWeidth(3, 6, 9, 0.034);
		double vol;

		System.out.println("Volume is " + mybox1.volume());
		System.out.println("Weidth is " + mybox1.weidth);
		System.out.println("Volume is " + mybox2.volume());
		//System.out.println("Weidth is " + mybox2.weidth);
	}
}

class Box {
	double width;
	double height;
	double depth;

	Box (double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;

		System.out.println("Box constructor with arguments");
	}

	Box () {
		System.out.println("Box constructor without arguments");
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

class BoxWeidth extends Box {
	double weidth;

	BoxWeidth(double width, double height, double depth, double weidth) {
                super(width, height, depth);
		this.weidth = weidth;

		System.out.println("BoxWeidth constructor");
        }

	@Override
	double volume() { return 0; }
}
