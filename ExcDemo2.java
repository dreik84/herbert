class ExcDemo2 {
	public static void main(String[] args) {
		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Перехватить исключение
			System.out.println("Индекс вышел за границы массива");
		}
		System.out.println("После оператора catch");
	}
}

// Исключение может быть сгенерированно одним методом и перехвачено другим
class ExcTest {
	// Генерирует исключение
	static void genException() {
		int[] nums = new int[4];                                                                                                                                                      System.out.println("Перед генерацией исключения");                                                                                                                            // Сгенерировать исключение выхода за пределы массива
												       nums[7] = 10;                                                                          System.out.println("Это отображаться не будет");
	}
}
