// Создание нескольких потоков
class MoreThreads {
	public static void main(String[] args) {
		System.out.println("Главный поток запущен");

		MyThread mt1 = MyThread.createAndStart("Child #1");
		MyThread mt2 = MyThread.createAndStart("Child #2");
		MyThread mt3 = MyThread.createAndStart("Child #3");

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
