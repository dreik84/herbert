// Использование приоритетов потоков
class Priority implements Runnable {
	int count;
	Thread thrd;
	static boolean stop = false;
	static String currentName;

	// Конструктор нового потока
	Priority(String name) {
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}

	// Точка входа в поток
	public void run() {
		System.out.println("Поток " + thrd.getName() + " запущен");

		do {
			count++;
			if (currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("В потоке " + currentName);
			}
		} while (stop == false && count < 10000000);

		stop = true;
		System.out.println("\nПоток " + thrd.getName() + " завершен");
	}
}
