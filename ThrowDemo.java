// Ручная генерация исключения
class ThrowDemo {
	public static void main(String[] args) {
		try {
			System.out.println("Перед оператором throw");

			throw new ArithmeticException(); // генерация исключения

		} catch (ArithmeticException exc) {
			
			// Перехватить исключение
			System.out.println("Исключение перехвачено");
		}
		System.out.println("После блока try/catch");
	}
}
