// Использование join() для ожидания окончания потоков

class DemoJoin {
	public static void main(String[] args) {
		
		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");
		NewThread nt3 = new NewThread("three");

		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		System.out.println("Поток One работает: " + nt1.t.isAlive());
		System.out.println("Поток Two работает: " + nt2.t.isAlive());
		System.out.println("Поток Three работает: " + nt3.t.isAlive());

		// ожидание завершения потоков
		try {
			System.out.println("Ожидание завершения потоков");

			nt1.t.join();
			nt2.t.join();
			nt3.t.join();

		} catch(InterruptedException e) {
			System.out.println("Главный поток прерван");
		}

		System.out.println("Поток One работает: " + nt1.t.isAlive());
                System.out.println("Поток Two работает: " + nt2.t.isAlive());
                System.out.println("Поток Three работает: " + nt3.t.isAlive());

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

		System.out.println("Завершениe потока " + name);
	}
}
