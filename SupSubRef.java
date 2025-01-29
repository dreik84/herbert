// Ссылка на суперкласс может ссылаться на объект подкласса
class SupSubRef {
        public static void main(String[] args) {
                X x = new X(10);
                X x2;
                Y y = new Y(5, 6);

                x2 = x; // Нормально, типы одинаковые
                System.out.println("x2.a: " + x2.a);

                x2 = y; // Тоже нормально, поскольку класс Y производный от X
                System.out.println("x2.a: " + x2.a);

                // Ссылкам X известны только члены X
                x2.a = 19;     // Нормально
                // x2.b = 27;  // Ошибка, член b в X отсутствует
        }
}

class X {
	int a;
	X(int i) { a = i; }
}

class Y extends X {
	int b;
	Y(int i, int j) {
		super(j);
		b = i;
	}
}
