class NestedClassDemo {
	public static void main(String[] args) {
		int[] x = { 3, 2, 1, 5, 6, 9, 7, 8 };
		Outer outOb = new Outer(x);

		outOb.analyze();
	}
}

// Использование внутреннего класса
class Outer {
	int[] nums;

	Outer(int[] n) {
		nums = n;
	}

	void analyze() {
		Inner inOb = new Inner();
		System.out.println("Минимальное значение: " + inOb.min());
		System.out.println("Максимальное значение: " + inOb.max());
		System.out.println("Среднее значение: " + inOb.avg());
	}

	// Внутренний класс
	class Inner {
		
		int min() {
			int m = nums[0];

			for (int i = 1; i < nums.length; i++)
				if (nums[i] < m) m = nums[i];
			
			return m;
		}

		int max() {
                        int m = nums[0];

                        for (int i = 1; i < nums.length; i++)
                                if (nums[i] > m) m = nums[i];
                                                                                                               return m;                                                                      }

		int avg() {
                        int a = 0;

                        for (int i = 1; i < nums.length; i++) a += nums[i];
                                                                                                               return a / nums.length;                                                        }
	}
}
