// Использование члена length для упрощения копирования массива
class ACopy {
	public static void main(String[] args) {
		int i;
		int[] nums1 = new int[10];
		int nums2[] = new int[10];

		for (i = 0; i < 10; i++) nums1[i] = i;

		// Копировать nums1 в nums2
		if (nums2.length >= nums1.length) // сравнение по length
			for (i = 0; i < 10; i++)
				nums2[i] = nums1[i];

		for (i = 0; i < nums2.length; i++)
			System.out.print(nums2[i] + " ");

		System.out.println();
	}
}
