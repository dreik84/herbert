// Демонстрация использования массивов строк
class StringArrays {
	public static void main(String[] args) {
		String[] strs = { "Это содержимое", "является", "просто", "текстом" };

		System.out.println("Исходный массив: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		// Изменить строки
		strs[1] = "стало";
		strs[3] = "ещё одним тестом!";

		System.out.println("Модифицированный массив: ");
                for (String s : strs)
                        System.out.print(s + " ");
		System.out.println("\n");
	}
}
