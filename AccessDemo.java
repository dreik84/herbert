class AccessDemo {
	public static void main(String[] args) {
		MyClass ob = new MyClass();

		// Доступ к alpha только через методы доступа
		ob.setAlpha(-99);
		System.out.println("ob.alpha: " + ob.getAlpha());

		// Получить доступ к alpha подобным образом нельзя
		// ob.alpha = 10;  // ошибка
		
		// Нормально, поскольку члены beta и gamma являются открытыми
		ob.beta = 88;
		ob.gamma = 99;
	}
}

// Сравнение открытого и закрытого доступа
class MyClass {
	private int alpha;  // закрытый доступ
	public int beta;    // открытый доступ
	int gamma;          // стандартный доступ
	
	// Методы доступа к alpha
	void setAlpha(int a) {
		alpha = a;
	}

	int getAlpha() {
		return alpha;
	}
}
