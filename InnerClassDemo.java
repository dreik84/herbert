// Демонстрация работы с внутренним классом

class InnerClassDemo {
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.test();
	}
}

class Outer {
	
	int outerX = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	// Внутренний класс
	class Inner {
		
		void display() {
			
			System.out.println("display() : outerX = " + outerX);
		}
	}
}
