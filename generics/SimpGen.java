// Демонстрация использования TwoGen
class SimpGen {
	public static void main(String[] args) {
		//TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");
		var tgObj = new TwoGen<Integer, String>(88, "Обобщения");

		tgObj.showTypes();

		int v = tgObj.getOb1();
		System.out.println("Значение: " + v);
		
		String str = tgObj.getOb2();
		System.out.println("Значение: " + str);

		if (tgObj.isSame(new TwoGen<>(88, "Обобщения"))) 
					System.out.println("Одинаковые");
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

	boolean isSame(TwoGen<T, V> o) {
		if (ob1 == o.ob1 && ob2 == o.ob2) return true;
		else return false;
	}

	T getOb1() { return ob1; }
	V getOb2() { return ob2; }
}
