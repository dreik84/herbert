/*
 * Программа отображает таблицу преобразования дюймов в метры
 */
class IncToMetTable {
	public static void main(String[] args) {
		double inches, meters, incPerMetr;
		int counter;

		incPerMetr = 39.37;
		counter = 0;
		for (inches = 1; inches <= 100; inches++) {
			meters = inches * incPerMetr; // преобразование в метры
			System.out.println(inches + " дюймов соответствует " + meters + "метрам");

			counter++;
			// После каждой 12-й строки вывести пустую строку
			if (counter == 12) {
				System.out.println();
				counter = 0; // сброс счетчика
			}
		}
	}
}
