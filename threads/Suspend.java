// Приостановка, возобновление и останов потока
class Suspend {
	public static void main(String[] args) {
		MyThread mt1 = MyThread.createAndStart("My Thread");

		try {
			Thread.sleep(1000); // позволить потоку mt1 начать выполнение
			mt1.mysuspend();
			System.out.println("Приостановка потока");
			
			Thread.sleep(1000);
			mt1.myresume();
			System.out.println("Возобновление потока");

			Thread.sleep(1000);
                        mt1.mysuspend();
                        System.out.println("Приостановка потока");

			Thread.sleep(1000);
                        mt1.myresume();
                        System.out.println("Возобновление потока");

			Thread.sleep(1000);
                        mt1.mysuspend();
                        System.out.println("Останов потока");
			mt1.mystop();
		}
		catch (InterruptedException exc) {
			System.out.println("Главный поток прерван");
		}

		// Ожидать завершения работы потока
		try {
			mt1.thrd.join();
		}
		catch (InterruptedException exc) {
                        System.out.println("Главный поток прерван");
                }
		System.out.println("Главный поток завершен");
	}
}

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
					while(suspended) {
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

	// Остановить поток
	synchronized void mystop() {
		stopped = true;
		suspended = false;
		notify();
	}

	// Приостановить поток
	synchronized void mysuspend() {
		suspended = true;
	}

	// Возобновить выполнение потока
	synchronized void myresume() {
		suspended = false;
		notify();
	}
}
