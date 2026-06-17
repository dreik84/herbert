// Демонстрация перегрузки методов

class Overload {
	public static void main(String[] args) {

		OverloadDemo od = new OverloadDemo();
		double result;

		od.test();
		od.test(10);
		od.test(10, 20);
		result = od.test(123.25);
		System.out.println("Результат вызова od.test(123.25): " + result);
	}
}

class OverloadDemo {
	
	void test() {
		System.out.println("Параметры отсутствуют");
	}

	//`void test(int a) {
	//	System.out.println("a : " + a);
	//}

	void test(int a, int b) {
		System.out.println("a и b: " + a + " " + b);
	}

	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}
}
