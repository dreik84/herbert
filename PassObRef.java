class PassObRef {
	public static void main(String[] args) {
		Test ob = new Test(15, 20);

		System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
		
		ob.change(ob);
		
		System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
	}
}


// Объекты передаются через ссылки на них
class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// Передаётся объект
	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}
}
