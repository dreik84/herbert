// Описание класса Vehicle
class Vehicle {
	private int passengers; // количество пассажиров
	private int fuelcap;    // запас топлива в галлонах
	private int mpg;        // расход топлива в милях на галлон
	
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

	// Методы доступа к переменным экземпляра
	int getPassengers() { return passengers; }
	void setPassengers(int p) { passengers = p; }
	int getFuelcap() { return fuelcap; }
	void setFuelcap(int f) { fuelcap = f; }
	int getMpg() { return mpg; }
	void setMpg(int m) { mpg = m; }
}
