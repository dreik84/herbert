// Динамическая диспечеризация методов

class Dispatch {
	public static void main(String[] args) {
		
		A a = new A();
		A b = new B();
		A c = new C();

		a.callme();
		b.callme();
		c.callme();
	}
}

class A {
	void callme() {
		System.out.println("class A");
	}
}

class B extends A {
        void callme() {
                System.out.println("class B");
        }
}

class C extends A {
	void callme() {
		System.out.println("class C");
	}
}
