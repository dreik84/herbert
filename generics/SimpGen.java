// Демонстрация использования TwoGen
class SimpGen {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = 
			new TwoGen<Integer, String>(88, "Обобщения");

		tgObj.showTypes();

		int v = tgObj.getOb1();
		System.out.println("Значение: " + v);
		
		String str = tgObj.getOb2();
		System.out.println("Значение: " + str);
	}
}

// Простой обобщенный класс с двумя параметрами типов
class TwoGen<T, V> {
	T ob1;
	V ob2;

	TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	void showTypes() {
		System.out.println("Тип T: " + ob1.getClass().getName());
		System.out.println("Тип T: " + ob2.getClass().getName());
	}

	T getOb1() { return ob1; }
	V getOb2() { return ob2; }
}
