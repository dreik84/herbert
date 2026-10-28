// Использование встроенных методов перечислений

class EnumDemo2 {
	public static void main(String[] args) {
		
		Apple ap;
		System.out.println("Все константы перечисления Apple:");

		Apple[] allApples = Apple.values();

		for (Apple a : allApples)
			System.out.println(a);

		System.out.println();

		ap = Apple.valueOf("Winesap");
		System.out.println("ap содержит " + ap);
	}
}

enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
