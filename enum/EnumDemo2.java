// Использование встроенных методов перечисления
enum Transport {
	CAR, TRUCK, AIRPLAIN, TRAIN, BOAT // объявление перечислений
}

class EnumDemo2 {
	public static void main(String[] args) {
		Transport tp;
		System.out.println("Все константы Transport: ");

		// Использовать метод values()
		Transport[] allTransports =Transport.values();
		
		for (Transport t : allTransports) System.out.println(t);

		System.out.println();

		// Использовать метод valueOf() 
		tp = Transport.valueOf("AIRPLAIN");
		System.out.println("tp содержит " + tp);
	}
}
