// Использование super для преодоления сокрытия имен

class UseSuper {
	public static void main(String[] args) {
		
		B subOb = new B(1, 2);
		subOb.show();
	}
}

class A {
	int i;
}

// Создаем подкласс путем расширения класса A
class B extends A {
	int i;  // этот член скрывает i в классе A

	B(int a, int b) {
		super.i = a;
		i = b;
	}

	void show() {
		System.out.println("i в суперклассе: " + super.i);
		System.out.println("i в подклассе: " + i);
	}
}
