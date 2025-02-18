class IFExtend {
	public static void main(String[] args) {
	MyClass ob = new MyClass();

	ob.meth1();
	ob.meth2();
	ob.meth3();
	}
}

// Один интерфейс может расширять другой
interface A {
	void meth1();
	void meth2();
}

// Интерфейс B теперь включает meth1() и meth2(), а также добавляется meth3()
interface B extends A {
	void meth3();
}

// В этом классе потребуется реализовать все методы интерфейсов A и B
class MyClass implements B {
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
