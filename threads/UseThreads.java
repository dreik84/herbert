class UseThreads {
	public static void main(String[] args) {
		System.out.println("Главный поток запущен");

		// Сначала сконструировать объект MyThread
		MyThread mt = new MyThread("Child #1");

		// Затем сконструировать поток из этого объекта
		Thread newThrd = new Thread(mt);

		// Наконец запустить поток на выполнение
		newThrd.start();

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException exc) {
				System.out.println("Главный поток прерван");
			}
		}
		System.out.println("Главный поток завершен");
	}
}
