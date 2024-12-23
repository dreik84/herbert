class OverloadDemo {
	public static void main(String[] args) {
	
	Overload ob = new Overload();
	int resI;
	double resD;

	// Вызвать все версии olvDemo()
	ob.ovlDemo();
	System.out.println();
	ob.ovlDemo(2);
	System.out.println();
	resI = ob.ovlDemo(4, 6);
	System.out.println("Результат вызова ob.ovlDemo(4, 6): " + resI);
	System.out.println();
	resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Результат вызова ob.ovlDemo(1.1, 2.32): " + resD);
	}
}

// Демонстрация перегрузки методов
class Overload {

	void ovlDemo() {  // первая версия
		System.out.println("Без параметров");
	}

	void ovlDemo(int a) {  // вторая версия
                System.out.println("Один параметр типа int: " + a);
        }

	int ovlDemo(int a, int b) {  // третья версия
		System.out.println("Два параметра типа int: " + a + " " + b);
		return a + b;
        }
	
	// Перегруженная версия ovlDemo с двумя параметрами
	double ovlDemo(double a, double b) {  // четвертая версия
                System.out.println("Два параметра типа double: " + a + " " + b);
		return a + b;
	}
}
