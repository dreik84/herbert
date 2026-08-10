// Один интерфейс может расширять другой

class IFExtend {
	public static void main(String[] args) {
		
		MyClass ob = new MyClass();

		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}

interface A {
	void meth1();
}

interface B {
	void meth2();
}

interface C extends A, B {
	void meth3();
}

class MyClass implements C {
	
	public void meth1() {
		System.out.println("Реализация meth1()");
	}

	public void meth2() {
                System.out.println("Реализация meth2()");
        }

	public void meth3() {
                System.out.println("Реализация meth3()");
        }
}
