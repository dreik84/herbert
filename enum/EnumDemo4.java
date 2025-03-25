// Демонстрация использования методов ordinal() и compareTo()
enum Transport {
	CAR, TRUCK, AIRPLANE, TRAIN, BOAT // объявление перечислений
}

class EnumDemo4 {
	public static void main(String[] args) {
		Transport tp, tp2, tp3; // ссылка на Transport

		// Получить все порядковые значения с применением ordinal()
		System.out.println("Все константы перечисления Transport" + 
				" вместе с их порядковыми номерами");
		for (Transport t : Transport.values())
			System.out.println(t + " " + t.ordinal());

		tp = Transport.AIRPLANE;
		tp2 = Transport.TRAIN;
		tp3 = Transport.AIRPLANE;

		System.out.println();

		// Демонстрация использования compareTo()
		if (tp.compareTo(tp2) < 0)
			System.out.println(tp + " находится перед " + tp2);

		if (tp.compareTo(tp2) > 0)
                        System.out.println(tp2 + " находится перед " + tp);

		if (tp.compareTo(tp3) == 0)
                        System.out.println(tp + " равно " + tp3);
	}
}
