class Shapes4 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);

		System.out.println("Информация об объекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
	
		System.out.println("Информация об объекте t2: ");
                t2.showStyle();
                t2.showDim();
                System.out.println("Площадь: " + t2.area());
                System.out.println();
	}
}
