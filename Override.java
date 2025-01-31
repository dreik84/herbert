// Переопределение и перегрузка методов
class Override {
	public static void main(String[] args) {
		B subOb = new B(1, 2, 3);
		
		subOb.show();          // вызывается show() из B
		subOb.show("Это k: "); // вызывается перегруженный метод show()
	}
}

class A {
	int i, j;

	A(int a, int b) {
		i = a;
		j = b;
	}

	// Отобразить значения
	void show() {
		System.out.println("i и j: " + i + " " + j);
	}
}

class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Отобразить k - переопределяет show() в A
	void show() {
		super.show(); // вызов версии метода определённого в суперклассе
		System.out.println("k: " + k);
	}

	// Перегруженный метод show()
	void show(String msg) {
		System.out.println(msg + k);
	}
}
