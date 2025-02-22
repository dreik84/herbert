// Демонстрация обработки исключений
class ExcDemo {
	public static void main(String[] args) {
		int[] nums = new int[4];

		try {
			System.out.println("Перед генерацией исключения");

			// Сгенерировать исключение выхода за пределы массива
			nums[7] = 10;
			System.out.println("Это отображаться не будет");
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Перехватить исключение
			System.out.println("Индекс вышел за границы массива");
		}
		System.out.println("После оператора catch");
	}
}
