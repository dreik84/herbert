// Описание класса Vehicle
class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap;    // запас топлива в галлонах
	int mpg;        // расход топлива в милях на галлон
	
	// Конструктор для класса Vehicle
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Возвращает дальность поездки
	int range() {
		return fuelcap * mpg;
	}

	// Рассчетывает объем топлива, необходимого для поездки на заданное расстояние
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}
}
