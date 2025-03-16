// Создание потока путем реализации интерфейса Runnable
class MyThread implements Runnable {
	Thread thrd; // ссылка на поток
	
	// Сконструировать новый поток
	MyThread(String name) {
		thrd = new Thread(this, name); // При создании потоку назначается имя
	}

	// Фабричный метод, который создает и запускает поток
	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);

		myThrd.thrd.start(); // запустить поток
		return myThrd;
	}

	// Точка входа в поток
	public void run() {
		System.out.println("Поток " + thrd.getName() + "запущен");
		
		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В потоке " + thrd.getName() +
					"значение count равно " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println("Поток " + thrd.getName() + "прерван");
		}
		System.out.println("Поток " + thrd.getName() + "завершен");
	}
}
