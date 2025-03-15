// Создание потока путем реализации интерфейса Runnable
class MyThread implements Runnable {
	String thrdName;

	MyThread(String name) {
		thrdName = name;
	}

	// Точка входа в поток
	public void run() {
		System.out.println("Поток " + thrdName + "запущен");
		
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В потоке " + thrdName +
					"значение count равно " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println("Поток " + thrdName + "прерван");
		}
		System.out.println("Поток " + thrdName + "завершен");
	}
}
