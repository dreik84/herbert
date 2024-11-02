// В этом классе объявляется объект типа Vehicle
class RetMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		int range1, range2;

		// Присвоить значения полям объекта minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присвоить значения полям объекта sportcar
                sportcar.passengers = 2;
                sportcar.fuelcap = 14;
                sportcar.mpg = 21;
		
		// Получить дальность поездки для разных транспортных средств
		range1 = minivan.range();
	       	range2 = sportcar.range();


		System.out.println("Минивэн может перевезти " + 
				minivan.passengers +
				" пассажиров на расстояние " + range1 + " миль.");
		System.out.println("Спортивный автомобиль может перевезти " + 
				sportcar.passengers +
                                " пассажиров на расстояние " + range2 + " миль.");
	}
}
