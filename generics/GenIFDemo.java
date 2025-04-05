// Пример использования обобщенного интерфейса
class GenIFDemo {
	public static void main(String[] args) {
		Integer[] x = { 1, 2, 3 };

		MyClass<Integer> ob = new MyClass<Integer>(x);

		if (ob.contains(2)) System.out.println("2 содержится ob");
		else System.out.println("2 НЕ содержится ob");

		if (ob.contains(5)) System.out.println("5 содержится ob");                             else System.out.println("5 НЕ содержится ob");

		// if (ob.contains(9.25)) // Ошибка!
	}
}

interface Contaiment<T> {
	boolean contains(T o);
}

class MyClass<T> implements Contaiment<T> {
	T[] arrayRef;

	MyClass(T[] o) {
		arrayRef = o;
	}

	public boolean contains(T o) {
		for (T x : arrayRef) if (x.equals(o)) return true;
		return false;
	}
}
