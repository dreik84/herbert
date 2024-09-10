/*
 * Демонстрация использования оператора if
 */
class IfDemo {
	public static void main(String[] args) {
		int a, b, c;

		a = 2;
		b = 3;
		
		if (a < b) System.out.println("a < b");
		System.out.println();

		c = b - a; // теперь переменная c содержит -1
		
		System.out.println(c);

		if (c >= 0) System.out.println("Значение c положительное");
		if (c < 0)  System.out.println("Значение c отрицательное");
	}
}
