// Поиск среднего значение типа double
class FindAverage {
	public static void main(String[] args) {
		double[] nums = new double[10];
		double sum = 0.0;

		for (int i = 0; i < 10; i++) nums[i] = i * 2.5;

		for (int i = 0; i < 10; i++) sum += nums[i];

		for (double num : nums) System.out.print(num + " ");

		System.out.println();
		System.out.println("Average: " + sum / nums.length);
	}
}
