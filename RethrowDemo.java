class RethrowDemo {
	public static void main(String[] args) {
		try {
			Rethrow.genException();
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Повторно перехватить исключение
			System.out.println("Неисправимая ошибка - программа завершена");
		}
	}
}

// Повторная генерация исключений
class Rethrow {
	public static void genException() {
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };
	
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " равно " +
						numer[i]/denom[i]);
			} catch (ArithmeticException exc) {
				// Перехватить исключение
				System.out.println("Деление на ноль невозможно");

		 	} catch (ArrayIndexOutOfBoundsException exc) {
                                // Перехватить исключение
                                System.out.println("Соответствующий элемент не найден");
				throw exc; // повторно сгенерировать исключение
			}
		}
	}
}

