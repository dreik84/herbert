// Пример применения вложенного оператора try
class NestTry {
	public static void main(String[] args) {
		
		try {
			int a = args.length;
			int b = 42 / a;

			System.out.println("a = " + a);

			try {
				if (a == 1) a = a / (a - a);

				if (a == 2) {
					int[] c = { 1 };
					c[42] = 99;
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Выход за границы массива");
			}
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль");
		}
	}
}
