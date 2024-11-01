// В этом классе объявляется объект типа Vehicle
class AddMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		// Присвоить значения полям объекта minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присвоить значения полям объекта sportcar
                sportcar.passengers = 2;
                sportcar.fuelcap = 14;
                sportcar.mpg = 21;
		
		System.out.println("Минивэн может перевезти " + minivan.passengers +
				" пассажиров");
		minivan.range(); // отобразить дальность поездки для minivan

		System.out.println("Спортивный автомобиль может перевезти " + 
				sportcar.passengers +
                                " пассажиров");
		sportcar.range(); // отобразить дальность поездки для sportcar
	}
}
