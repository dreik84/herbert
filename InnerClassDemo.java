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

		for (int i = 0; i < 10; i++) {
			
			class Inner2 {
				void display() {
					System.out.println("outerX = " + outerX);
				}
			}

			Inner2 inner2 = new Inner2();
			inner2.display();

		}

		Inner inner = new Inner();
		inner.display();
	}

	// Внутренний класс
	class Inner {

		int innerY = 10;
		
		void display() {
			
			System.out.println("display() : outerX = " + outerX);
		}
	}

	void showY() {
		// System.out.println(innerY); // ошибка, переменная здесь неизвестна
	}
}
