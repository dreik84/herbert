// Использование выведения типов локальных переменных с классом

class RefVarDemo {
	public static void main(String[] args) {
		
		var mc = new MyClass(10);

		System.out.println("i = " + mc.geti());

		mc.seti(19);

		System.out.println("i = " + mc.geti());
	}
}

class MyClass {
	
	private int i;

	MyClass(int k) { i = k; }

	int geti() { return i; }
	void seti(int k) { if (k >= 0) i = k; }	
}
