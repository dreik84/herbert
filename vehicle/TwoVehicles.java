// В этом классе объявляется объект типа Vehicle
class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		int range;

		// Присвоить значения полям объекта типа Vehicle
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Рассчитать дальность при полном баке
		range = minivan.fuelcap * minivan.mpg;
		
		System.out.println("Минивэн может перевезти " + minivan.passengers +
				" пассажиров на расстояние " + range + " миль.");
	}
}
