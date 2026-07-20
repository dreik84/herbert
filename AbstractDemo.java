// Простая демонстрация применения abstract

class AbstractDemo {
	public static void main(String[] args) {

	A a = new B();
	B b = new B();

	a.callme();
	b.callme();
	b.callmetoo();
	}
}

abstract class A {
	
	abstract void callme();

	void callmetoo() {
		System.out.println("Это конкретный метод");
	}
}

class B extends A {
	
	void callme() {
		System.out.println("Реализация callme() в класс B");
	}
}
