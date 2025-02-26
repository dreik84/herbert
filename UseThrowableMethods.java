class UseThrowableMethods {
	public static void main(String[] args) {
		try {
			ExcTest.getException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Перехватить исключение
			System.out.println("Стандартное сообщение");
			System.out.println(exc);
			System.out.println("\nТрассировка стека");
			exc.printStackTrace();
		}
		System.out.println("После оператора catch");
	}
}

// Использование методов класса Throwable
class ExcTest {
	static void getException() {
	int[] nums = new int[4];

	System.out.println("Перед генерацией исключения");

	// Сгенерировать исключение выхода индекса за границы массива
	nums[7] = 10;

	System.out.println("Это отображаться не будет");
	}
}
