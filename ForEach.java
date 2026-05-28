// Использование цикла for в стиле "for-each"
class ForEach {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;

		for (int x : nums) {
			
			System.out.println(x);
			sum += x;

			x = x * 10; // не влияет на nums

			if (x == 5) break;
		}

		System.out.println("sum: " + sum);

		for (int x : nums)
			System.out.print(x + " ");

		System.out.println();
	}
}
