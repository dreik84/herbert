// Использование инициализатора массива
class MinMax2 {
	public static void main(String[] args) {
		int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		int min, max;		
		min = max = nums[0];

		for (int i = 0; i < 10; i++) {
			if (nums[i] < min) min = nums[i];
			if (nums[i] > max) max = nums[i];
		}
		System.out.println("Минимальное и максимальное значения: " + 
				min + " " + max);
	}
}
