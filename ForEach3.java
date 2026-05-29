// Использование цикла for в стиле "for-each" для прохода по многомерному массиву
class ForEach3 {
	public static void main(String[] args) {
		
		int sum = 0;
		int[][] nums = new int[3][5];

		for (int i = 0; i < 3; i++) 
			for (int j = 0; j < 5; j++)
				nums[i][j] = (i + 1) * (j + 1);

		for (int[] x : nums)
			for (int y : x) {
				System.out.println(y);
				sum += y;
			}

		System.out.println("sum : " + sum);
	}
}	
