// Перечисление разнообразных транспортных средств
enum Transport {
	CAR, TRUCK, AIRPLAIN, TRAIN, BOAT // объявление перечислений
}

class EnumDemo {
	public static void main(String[] args) {
		Transport tp; // ссылка на Transport

		tp = Transport.AIRPLAIN; // присваивание константы AIRPLAIN

		// Вывести значение перечисления
		System.out.println("Значение tp: " + tp);
		System.out.println();

		// Сравнить два значения перечисления
		if (tp == Transport.TRAIN) 
			System.out.println("tp содержит TRAIN.\n");
		
		// Управление оператором switch
		switch (tp) {
			case CAR:
				System.out.println("Автомобиль перевозит людей");
				break;
			case TRUCK:
				System.out.println("Грузовик доставляет грузы");
				break;
			case AIRPLAIN:
				System.out.println("Самолет летит");
				break;
			case TRAIN:
				System.out.println("Поезд движется по рельсам");
				break;
			case BOAT:
				System.out.println("Корабль плывет по воде");
				break;
		}
	}
}
