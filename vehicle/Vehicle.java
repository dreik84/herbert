// Описание класса Vehicle
class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap;    // запас топлива в галлонах
	int mpg;        // расход топлива в милях на галлон
	
	// Возвращает дальность поездки
	int range() {
		return fuelcap * mpg;
	}
}
