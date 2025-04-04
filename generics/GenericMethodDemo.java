// Демонстрация использования простого обощенного метода
class GenericMethodDemo {
	// Выяснить, совподает ли содержимое массивов
	static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[] x, V[] y)
	{
		// Если длины массивов отличаются, то отличается и содержимое
		if (x.length != y.length) return false;
		return true;
	}

	public static void main(String[] args) {
		Integer[] nums = { 1, 2, 3, 4, 5 };
		Integer[] nums2 = { 1, 2, 3, 4, 5 };
		Integer[] nums3 = { 1, 2, 7, 4, 5 };
		Integer[] nums4 = { 1, 2, 7, 4, 5, 6 };

		if (arrayEqual(nums, nums)) System.out.println("nums = nums");
		if (arrayEqual(nums, nums2)) System.out.println("nums = nums2");
		if (arrayEqual(nums, nums3)) System.out.println("nums = nums3");
		if (arrayEqual(nums, nums4)) System.out.println("nums = nums4");

		//  Создать массив элементов Double
		Double[] dval = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		
		// не скомпилируется
		// if (arrayEqual(nums, dval)) System.out.println("nums = dval");
	}
}
