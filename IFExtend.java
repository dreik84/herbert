// Один интерфейс может расширять другой

class IFExtend {
	public static void main(String[] args) {
		
		MyClass ob = new MyClass();

		ob.meth1();
		ob.meth2();
		ob.meth3();
		ob.meth4();
	}
}

interface A {
	void meth1();

	default void meth4() {
		System.out.println("meth4 in A");
	}
}

interface B {
	void meth2();

	default void meth4() {
                System.out.println("meth4 in B");
        }
}

interface C extends A, B {

	default void meth3() {
		System.out.println("Реализация meth3()");
	}

	default void meth4() {
		A.super.meth4();
	}
}

class MyClass implements C {
	
	public void meth1() {
		System.out.println("Реализация meth1()");
	}

	public void meth2() {
                System.out.println("Реализация meth2()");
        }

	//public void meth4() {
        //        System.out.println("Реализация meth4()");
        //}
}
