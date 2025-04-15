// Демонстрация использования ссылки на конструктор
class ConstructorRefDemo {
	public static void main(String[] args) {
		
		MyFunc myClassCons = MyClass::new; // ссылка на конструктор

		MyClass mc = myClassCons.func("Test");

		System.out.println("str in mc: " + mc.getStr());
	}
}

interface MyFunc {
	MyClass func(String s);
}

class MyClass {
	private String str;

	MyClass(String s) { str = s; }
	MyClass() { str = ""; }

	String getStr() { return str; }
}
