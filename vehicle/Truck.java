// Расширение класса Vehicle
class Truck extends Vehicle {
	private int cargocap; // грузоподъёмность в фунтах
	
	
	// Конструктор для класса Truck
	Truck(int p, int f, int m, int c) {
		super(p, f, m); // инициализация членов суперкласса
		
		cargocap = c;
	}

	// Методы доступа для cargocap
	int getCargo() { return cargocap; }
	void setCargo(int c) { cargocap = c; }
}
