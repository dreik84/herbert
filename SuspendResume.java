// Приостановка и возобновление современным способом

class SuspendResume {
	public static void main(String[] args) {
		
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");

		ob1.t.start();
		ob2.t.start();

		try {
			Thread.sleep(1000);

			ob1.mySuspend();
			System.out.println("Приостаноска потока One");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println("Возобновление потока One");

			ob2.mySuspend();
                        System.out.println("Приостаноска потока Two");
                        Thread.sleep(1000);
                        ob2.myResume();
                        System.out.println("Возобновление потока Two");
		} catch(InterruptedException e) {
			System.out.println("Главный поток прерван");
		}

		try {
			System.out.println("Ожидание завершения потоков");
			ob1.t.join();
			ob2.t.join();
		} catch(InterruptedException e) {
                        System.out.println("Главный поток прерван");
                }

		System.out.println("Главный поток завершается");
	}
}

class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;

	NewThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Новый поток: " + t);
		suspendFlag = false;
	}

	public void run() {
		
		try {
			for(int i = 15; i > 0; i--) {
				System.out.println(name + ": " + i);

				Thread.sleep(200);

				synchronized(this) {
					
					while(suspendFlag) wait();
				}
			}
		} catch(InterruptedException e) {
			System.out.println(name + " прерван");
		}

		System.out.println(name + " завершается");
	}

	synchronized void mySuspend() {
		suspendFlag = true;
	}

	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}
