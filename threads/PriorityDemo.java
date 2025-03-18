class PriorityDemo {
	public static void main(String[] args) {
		Priority mt1 = new Priority("Высокий приоритет");
		Priority mt2 = new Priority("Низкий приоритет");
		Priority mt3 = new Priority("Нормальный приоритет #1");
		Priority mt4 = new Priority("Нормальный приоритет #2");
		Priority mt5 = new Priority("Нормальный приоритет #3");

		// Установить приоритеты
		mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

		// Запустить потоки
		mt1.thrd.start();
		mt2.thrd.start();
		mt3.thrd.start();
		mt4.thrd.start();
		mt5.thrd.start();

		try {
			mt1.thrd.join();
			mt2.thrd.join();
			mt3.thrd.join();
			mt4.thrd.join();
			mt5.thrd.join();
		}
		catch (InterruptedException exc) {
			System.out.println("Главный поток прерван");
		}
		
		System.out.println("\nПоток с высоким приоритетом досчитал до "
				+ mt1.count);
		System.out.println("Поток с низким приоритетом досчитал до "
                                + mt2.count);
		System.out.println("1-й поток с нормальным приоритетом досчитал до "
                                + mt3.count);
		System.out.println("2-й поток с нормальным приоритетом досчитал до "                                   + mt4.count);
		System.out.println("3-й поток с нормальным приоритетом досчитал до "                                   + mt5.count);
	}
}
