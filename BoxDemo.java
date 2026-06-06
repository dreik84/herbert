// Программа, в которой используется класс Box
class Box {
	double width;
	double height;
	double depth;
}

class BoxDemo {
	public static void main(String[] args) {
		
		Box mybox = new Box();
		double vol;

		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		vol = mybox.width * mybox.height * mybox.depth; // объем коробки

		System.out.println("Объем коробки равен " + vol);
	}
}
