/*
 * Программа для преобразования галлонов в литры
 */
class GalToLit {
	public static void main(String[] args) {
		double gallons;  // хранит количество галлонов
		double liters;   // хранит результат преобразования в литры

		gallons = 10;    // начать с 10 галлонов
		liters = gallons * 3.7854;  // преобразование в литры
		System.out.println(gallons + " галлонов соответствует " + liters + " литрам");
	}
}
