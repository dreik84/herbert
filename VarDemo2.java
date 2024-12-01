// Выведение типов локальных переменных определённых пользователем
class VarDemo2 {
	public static void main(String[] args) {
		var mc = new MyClass(10); // применение var

		System.out.println("Значение i в mc равно " + mc.geti());

		mc.seti(19);
		System.out.println("Значение i в mc равно " + mc.geti());
	}
}

class MyClass {
        private int i;

        MyClass(int k) { i = k; }

        int geti() { return i; }
        void seti(int k) { if (k >= 0) i = k; }
}
