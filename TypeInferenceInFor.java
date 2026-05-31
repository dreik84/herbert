// Использование выведения типов локальных переменных в цикле for 
class TypeInferenceInFor {
	public static void main(String[] args) {
		
		System.out.print("Значение x: ");

		for (var x = 2.5; x < 100.0; x *= 2)
			System.out.print(x + " ");

		System.out.println();

		int[] nums = { 1, 2, 3, 4, 5, 6 };

		System.out.print("Значение в массиве nums: ");

		for (var v : nums) 
			System.out.print(v + " " );

		System.out.println();
	}
}
