class SumDemo {
	public static void main(String[] args) {
		Summation s1 = new Summation(5);
		Summation s2 = new Summation(s1);

		System.out.println("s1.sum: " + s1.sum);
		System.out.println("s2.sum: " + s2.sum);
	}
}

// Инициализация одного объекта с помощью другого
class Summation {
	int sum;

	// Конструирование на основе значения типа int
	Summation(int num) {
		sum = 0;
		for (int i = 1; i <=num; i++) sum += i;
	}

	// Конструирование на основе другого объекта
        Summation(Summation ob) {
                sum = ob.sum;
	}
}
