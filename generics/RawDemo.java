// Демонстрация использования низкоуровнего типа
class RawDemo {
	public static void main(String[] args) {
		
		Gen<Integer> iOb = new Gen<Integer>(88);
		Gen<String> strOb = new Gen<String>("Тестирование обобщений");

		Gen raw = new Gen(98.6); // низкоуровневый тип
		
		double d = (Double) raw.getOb();
		System.out.println("значение: " + d);

		// int i = (Intger) raw.getOb(); // ошибка во время выполнения

		strOb = raw; // нормально, но потенциально ошибочно
		
		// String str = strOb.getOb(); // ошибка во время выполнения

		raw = iOb; // нормально, но потенциально ошибочно
		
		// d = (Double) raw.getOb(); // ошибка во время выполнения
	}
}

// Испоьлзование низкоуровнего типа
class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}
}
