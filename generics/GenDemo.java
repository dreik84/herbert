// Демонстрация использования обобщенного класса
class GenDemo {
	public static void main(String[] args) {
		Gen<Integer>  iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение: " + v);

		System.out.println();

		Gen<String> strOb = new Gen<String>("Тестирование обобщений");
		strOb.showType();
		String str = strOb.getOb();
		System.out.println("Значение: " + str);
		
	}
}

// Простой обобщенный класс
class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Тип T: " + ob.getClass().getName());
	}
}
