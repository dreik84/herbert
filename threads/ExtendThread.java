class ExtendThread {
	public static void main(String[] args) {
		System.out.println("Главный поток запущен");

		MyThread mt = new MyThread("Child #1");
		mt.start();

		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Главный поток прерван");
			}
		}
		System.out.println("Главный поток завершен");
	}
}

// Расширение класса Thread
class MyThread extends Thread {
	
	// Конитруктор нового потока
	MyThread(String name) {
		super(name); // имя потока
	}

	public static MyThread createAndStart(String name) {
		MyThread myThrd = new MyThread(name);
		myThrd.start();
		return myThrd;
	}

	// Точка входа в поток
	public void run() {
		System.out.println("Поток " + getName() + " запущен");

		try {
			for (int count = 0; count < 10; count++) {
				Thread.sleep(400);
				System.out.println("В потоке " + getName() +
					    	" значение count равно " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println("Поток " + getName() + " прерван");
		}
		System.out.println("Поток " + getName() + " завершен");
	}
}
