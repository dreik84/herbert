// Использование специального исключения
class CustomExceptDemo {
	public static void main(String[] args) {
		// Массив numer содержит несколько нечетных значений
		int[] numer = { 4, 8, 15, 32, 64, 127, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < numer.length; i++) {
			try {
				if (numer[i] % 2 != 0) 
					throw new NonIntResultException(numer[i], denom[i]);
				System.out.println(numer[i] + " / " + denom[i] +
						" равно " + numer[i]/denom[i]);
			} catch (ArithmeticException exc) {
				// Перехватить исключение
				System.out.println("Деление на ноль невозможно");
			} catch (ArrayIndexOutOfBoundsException exc) {
				// Перехватить исключение
				System.out.println("Соответствующий элемент не найден");
			} catch (NonIntResultException exc) {
				// Перехватить исключение
                                System.out.println(exc);
			}
		}
	}
}

// Создать класс исключения
class NonIntResultException extends Exception {
	int n, d;
	
	NonIntResultException(int i, int j) {
		n = i;
		d = j;
	}

	public String toString() {
		return "Результат " + n + " / " + d + " не является целочисленным";
	}
}
