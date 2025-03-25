// Использование конструктора, переменной экземпляра и метода перечисления
enum Transport {
	CAR(100), TRUCK(90), AIRPLANE(950), TRAIN(110), BOAT(35);
	
	private int speed; // типичная скорость транспортного средства
	
	// Конструктор
	Transport(int s) { speed = s; }

	int getSpeed() { return speed; }
}

class EnumDemo3 {
	public static void main(String[] args) {
		Transport tp;

		// Отобразить скорость самолета
		System.out.println("Типичная скорость самолета составляет " +
				Transport.AIRPLANE.getSpeed() + " км/ч");

		// Отобразить все транспортные средства
		System.out.println("Скорости движения всех транспортных средств");

		for (Transport t : Transport.values())
			System.out.println("Типичная скорость" + t +  " составляет "
					+ t.getSpeed() + " км/ч");
	}
}
