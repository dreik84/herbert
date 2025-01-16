// Вычисление суммы с использованием аргумента переменной длины
class VarArgsSum {
	public static void main(String[] args) {
		System.out.println("Сумма чисел 1, 2, 3 равна: " + sum(1, 2, 3));
		System.out.println("Сумма чисел 1, 2, 5 равна: " + sum(1, 2, 5));
		System.out.println("Сумма чисел 1, 2, 8 равна: " + sum(1, 2, 8));
	}

	public static int sum(int ... nums) {
		int res = 0;

		for (int num : nums) {
			res += num;
		}

		return res;
	}
}
