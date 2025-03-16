class ThreadVariations {
	public static void main(String[] args) {
		System.out.println("Главный поток запущен");

                // Создать и запустить поток
                MyThread mt = MyThread.createAndStart("Child #1");

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
