// В этом классе объявляется объект типа Vehicle
class VehConsDemo {
	public static void main(String[] args) {
		// Создать объеты транспортных средств
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportcar = new Vehicle(2, 14, 12);
		double gallons;
		int dist = 252;

		gallons = minivan.fuelNeeded(dist);
		System.out.println("Для поездки на расстояние " + dist
			       	+ " миль минивэну требуется " 
				+ gallons + " галонов топлива.");

		gallons = sportcar.fuelNeeded(dist);
		System.out.println("Для поездки на расстояние " + dist
                                + " миль спортивному автомобилю требуется "
                                + gallons + " галонов топлива.");
	}
}
