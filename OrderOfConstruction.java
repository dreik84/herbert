// Демонстрация выполнения конструкторов
class OrderOfContruction {
	public static void main(String[] args) {
		C c = new C();
	}
}

// Создать суперкласс
class A {
	A() {
		System.out.println("Конструктор A.");
	}
}

// Создать подкласс путем расширения класса A
class B extends A {
	B() {
		System.out.println("Контруктор B.");
	}
}

// Создать ещё один подкласс путем расширения класса B
class C extends B {
	C() {
		System.out.println("Конструктор C.");
	}
}
