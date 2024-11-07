// В этом классе объявляется объект типа Vehicle
class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();
		double gallons;
		int dist = 252;

		// Присвоить значения полям объекта minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присвоить значения полям объекта sportcar
                sportcar.passengers = 2;
                sportcar.fuelcap = 14;
                sportcar.mpg = 12;
		
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
