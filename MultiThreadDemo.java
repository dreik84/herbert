// Создание множества потоков

class MultiThreadDemo {
	public static void main(String[] args) {
		
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");
		NewThread nt3 = new NewThread("three");

		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Главный поток: " + i);
				Thread.sleep(10000);
			}
		} catch(InterruptedException e) {
			System.out.println("Главный поток прерван");
		}

		System.out.println("Завершение главного потока");
	}
}

class NewThread implements Runnable {
	Thread t;
	String name;

	NewThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);                // Создание потока
		System.out.println("Новый поток " + t);
	}

	// Точка входа для потока
	public void run() {
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " поток: " + i);
				Thread.sleep(1000);		
			}

		} catch(InterruptedException e) {
			System.out.println(name + " поток прерван");		
		}

		System.out.println("Завершениe потока" + name);
	}
}
