// Цикл for в стиле "for-each" по существу допускает только чтение
class NoChange {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int x : nums) {
			System.out.print(x + " ");
			x = x * 10; // Эта операция не приводит к изменению массива
		}
		
		System.out.println();

		for (int x : nums)
			System.out.print(x + " ");

		System.out.println();
	}
}
