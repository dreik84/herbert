// Простой пример наследования

class SimpleInheritance {
	public static void main(String[] args) {

		A superOb = new A();
		B subOb = new B();

		superOb.i = 10;
		superOb.j = 20;
		superOb.showij();

		System.out.println();

		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		subOb.showij();
		subOb.showk();
		subOb.sum();
	}
}

// Создаем суперкласс
class A {
	int i, j;

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Создаем подкласс путем расширения класса А
class B extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i + j + k = " + (i + j + k));
	}
}
