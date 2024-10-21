// Использование break для выхода из цикла
class BreakDemo {
	public static void main(String[] args) {
		int num;
		num = 100;

		// Цикл до тех пор, пока квадрат i меньше num
		for (int i = 0; i < num; i++) {
			if (i * i >= num) break; // прекратить выполнение цикла
			System.out.print(i + " ");
		}
		System.out.println("Цикл завершён.");
	}
}
