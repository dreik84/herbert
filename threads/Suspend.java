// Приостановка, возобновление и останов потока

class MyThread implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean stopped;

	MyThread(String name) {
		thrd = new Thread(name);
		suspended = false;
		stopped = false;
	}

	// Фабричный метод который создает и запускает поток
	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);

		myThrd.thrd.start(); // запустить поток
		return myThrd;
	}

	// Точка входа в поток
	public void run() {
		System.out.println("Поток " + thrd.getName() + " запущен");

		try {
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i % 10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}

				// Использовать блок synchronized для проверки
				synchronized(this) {
					while(suspected) {
						wait();
					}
					if (stopped) break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println("Поток " + thrd.getName() + " прерван");
		}
		System.out.println("Поток " + thrd.getName() + " завершен");
	}
}
