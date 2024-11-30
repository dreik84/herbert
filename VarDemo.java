// Простая демонстрация выведения типа локальных переменных
class VarDemo {
	public static void main(String[] args) {
		
		// Использование выведения типов для определения типа переменной
		var avg = 10.0;
		System.out.println("Значение avg: " + avg);

		// Здесь var - просто имя переменной
		int var = 1;
		System.out.println("Значение var: " + var);

		// Здесь var и тип объявления и имя переменной
		var k = -var;
		System.out.println("Значение k: " + k);
	}
}
