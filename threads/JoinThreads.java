// Использование join()
class JoinThreads {
	public static void main(String[] args) {
		System.out.println("Главный поток запущен");

		MyThread mt1 = MyThread.createAndStart("Child #1");
		MyThread mt2 = MyThread.createAndStart("Child #2");
		MyThread mt3 = MyThread.createAndStart("Child #3");

		try {
			mt1.thrd.join();
			System.out.println("Поток Child #1 присоединен");
			mt2.thrd.join();
                        System.out.println("Поток Child #2 присоединен");
			mt3.thrd.join();
                        System.out.println("Поток Child #3 присоединен");
		} 
		catch (InterruptedException exc) {
                	System.out.println("Главный поток прерван");
                }

		System.out.println("Главный поток завершен");
	}
}
