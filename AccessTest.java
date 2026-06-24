// Отличие между модификатрами доступа private и public

class AccessTest {
	public static void main(String[] args) {
		
		Test ob = new Test();

		ob.a = 10;
		ob.b = 20;

		// ob.c = 100; // ошибка

		ob.setc(100);

		System.out.println("a, b, c: " + ob.a + " " + ob.b + " " + ob.getc());
	}
}

class Test {
	
	int a;         // стандартный доступ
	public int b;  // открытый доступ
	private int c; // закрытый доступ
	
	// методы доступа к c
	void setc(int i) { c = i; }

	int getc() { return c; }	
}
