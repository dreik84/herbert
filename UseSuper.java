class UseSuper {
	public static void main(String[] args) {
		B subOb = new B(1, 2);
		subOb.show();
	}	
}

// Использование super для преодоления сокрытия имён
class A {
	int i;
}

// Создать подкласс, расширив класс А
class B extends A {
	int i;  // этот член в i скрывает член i в A
	
	B(int a, int b) {
		super.i = a;  // i в A
		i = b;        // i в B
	}

	void show() {
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе: " + i);	
	}
}
