class Exc2 {
	
	static void subroutine(int d) {
		
		try {

			int a = 10 / d;
			System.out.println("Это выводиться не будет");

		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль");
			System.out.println("Исключение: " + e);
		}

		System.out.println("После оператора catch");
	}

	public static void main(String[] args) {
		subroutine(0);
	}
}
