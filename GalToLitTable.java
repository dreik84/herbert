/*
 * Программа отображает таблицу преобразований галлонов в литры
 */
class GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters, litPerGal;
		int counter;

		litPerGal = 3.7854;
		counter = 0;
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * litPerGal; // преобразование в литры
			System.out.println(gallons + " галлонов соответствует " + liters + "литрам");

			counter++;
			// После каждой 10-й строки вывести пустую строку
			if (counter == 10) {
				System.out.println();
				counter = 0; // сброс счетчика
			}
		}
	}
}
