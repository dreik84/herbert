// Обобщения и массивы
class GenArrays {
	public static void main(String[] args) {
	Integer[] n = { 1, 2, 3, 4, 5 };

	Gen<Integer> iOb = new Gen<Integer>(50, n);

	// Gen<Integer>[] gens = new Gen<Integer>[10]; // Ошибка!
	
	Gen<?>[] gens = new Gen<?>[10]; // нормально
	}
}

class Gen<T extends Number> {
	T ob;
	T[] vals; // нормально
	
	Gen(T o, T[] nums) {
		ob = o;
		// vals = new T[]; // недопустимо
		vals = nums; // нормально
	}
}
