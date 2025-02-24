// Изящно обработать ошибку и продолжить работу
class ExcDemo3 {
	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32, 64, 128 };
		int[] denum = { 2, 0, 4, 4, 0, 8 };
		
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denum[i] + " равно " +
						numer[i]/denum[i]);
			} catch (ArithmeticException exc) {
				// Перехватить исключение
				System.out.println("Деление на ноль невозможно");
			}
		}
	}
}
