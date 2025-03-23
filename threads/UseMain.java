// Управление главным потоком
class UseMain {
	public static void main(String[] args) {
		Thread thrd;

		// Получить главный поток
		thrd = Thread.currentThread();

		// Отобразить имя главного потока
		System.out.println("Имя главного потока: " + thrd.getName());

		// Отобразить приоритет главного потока
		System.out.println("Приоритет главного потока: " + thrd.getPriority());

		System.out.println();

		// Установить имя и приоритет
		System.out.println("Установка имени и приоритета\n");

		thrd.setName("Thread #1");
		thrd.setPriority(Thread.NORM_PRIORITY + 3);

		System.out.println("Новое имя главного потока: " + thrd.getName());
		System.out.println("Новый приоритет главного потока: " + 
				thrd.getPriority());
	}
}
