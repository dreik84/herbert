// Использование вложенного блока try
class NestTrys {
	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };

		try {
			// Внешний блок try
			for (int i = 0; i < numer.length; i++) {
                        try {
				// Вложенный блок tryA
                                System.out.println(numer[i] + " / " + denom[i] + " равно " +
                                                numer[i]/denom[i]);
                        } catch (ArithmeticException exc) {
                                // Перехватить исключение
                                System.out.println("Деление на ноль невозможно");
                        }
                }
		} catch (ArrayIndexOutOfBoundsException exc) {
                                // Перехватить исключение
                                System.out.println("Соответствующий элемент не найден");
                                System.out.println("Неисправимая ошибка - программа завершена");
		}
	}
}
