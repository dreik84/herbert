// Описание класса Vehicle
class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap;    // запас топлива в галлонах
	int mpg;        // расход топлива в милях на галлон
	
	// Отображает дальность поездки
	void range() {
		System.out.println("Дальность поездки в милях: " + fuelcap * mpg);
	}
}
