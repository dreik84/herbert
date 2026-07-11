// Наследование для расширения класса Box
class DemoBoxWeight {
	public static void main(String[] args) {
		
		// Объявить, разместить в памяти и инициализировать объекты Box
		BoxWeidth mybox1 = new BoxWeidth(10, 20, 15, 34.3);
		Box mybox2 = new BoxWeidth(3, 6, 9, 0.034);
		Box mybox3 = new BoxWeidth();
		Box myBox4 = new BoxWeidth(2, 7);
		double vol;

		System.out.println("Volume is " + mybox1.volume());
		System.out.println("Weidth is " + mybox1.weight);
		System.out.println("Volume is " + mybox2.volume());
		//System.out.println("Weidth is " + mybox2.weight);
	}
}

class Box {
	private double width;
	private double height;
	private double depth;

	Box (Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;

		System.out.println("Box constructor with Box argemnt");
	}

	Box (double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;

		System.out.println("Box constructor with arguments");
	}

	Box () {
		System.out.println("Box constructor without arguments");
	}

	Box (double len) {
		width = height = depth = len;

		System.out.println("Box constructor with one argument");
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
	double weight;

	BoxWeidth(BoxWeidth ob) {
		super(ob);
		weight = ob.weight;
	}

	BoxWeidth(double len, double w) {
		super(len);
		weight = w;
	}

	BoxWeidth() {
		super();
	}

	BoxWeidth(double width, double height, double depth, double weight) {
                super(width, height, depth);
		this.weight = weight;

		System.out.println("BoxWeidth constructor");
        }

	@Override
	double volume() { return 0; }
}
