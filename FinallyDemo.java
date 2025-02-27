class FinallyDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			UseFinally.genException(i);
			System.out.println();
		}
	}
}

// Использование finally
class UseFinally {
	public static void genException(int what) {
		int t;
		int[] nums = new int[2];

		System.out.println("Получено: " + what);

		try {
			switch (what) {
				case 0:
					t = 10 / what; // генерация ошибки деления на 0
					break;
				case 1:
					nums[4] = 4; // генерация ошибки выхода индекса
					break;
				case 2:
					return; // возвращение из блока try
			}
		} catch (ArithmeticException exc) {
			// Перехватить исключение
			System.out.println("Деление на ноль невозможно");
			return; // возвращение из catch
		} catch (ArrayIndexOutOfBoundsException exc) {
                        // Перехватить исключение
                        System.out.println("Соответствующий элемент не найден");
                } finally {
			System.out.println("Выход из try");
		}
	}

}
