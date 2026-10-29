// Использование конструктора перечисления, переменной экземпляра и метода

class EnumDemo3 {
	public static void main(String[] args) {
		
		Apple ap;
		
		System.out.println("Winesap costs " + Apple.Winesap.getPrice());

		System.out.println("Цены на все сорта яблок:");

		for (Apple a : Apple.values()) 
			System.out.println("Apple " + a + " costs " + a.getPrice());
	}
}

enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

	private int price;

	Apple(int p) { price = p; }

	int getPrice() { return price; }
}
