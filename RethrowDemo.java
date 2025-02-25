// Использование нескольких операторов catch
class ExcDemo5 {
	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int[] denom = { 2, 0, 4, 4, 0, 8 };
	
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " равно " +
						numer[i]/denom[i]);
			} catch (ArrayIndexOutOfBoundsException exc) {
				// Перехватить исключение подкласса
				System.out.println("Соответствующий элемент не найден");
			} catch (Throwable exc) {
				// Перехватить исключение суперкласса
                                System.out.println("Возникло какое-то исключение");
			}
		}
	}
}
