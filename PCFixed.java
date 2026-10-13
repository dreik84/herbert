// Корректная реализация производителя и потребителя
class PCFixed {
	public static void main(String[] args) {
		
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.t.start();
		c.t.start();

		System.out.println("Нажите <Ctrl-C>, чтобы остановить программу.");
	}
}

class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		
		while (!valueSet) {
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Перехвачено ислючение");
			}
		}	

		System.out.println("Получено: " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {

		while (valueSet) {
                        try {
                                wait();
                        } catch(InterruptedException e) {
                                System.out.println("Перехвачено ислючение");
                        }
                }

		this.n = n;
		valueSet = true;
		System.out.println("Отправлено: " + n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q) {
		this.q = q;
		t = new Thread(this, "Производитель");
	}

	public void run() {
		int i = 0;

		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q q) {
		this.q = q;
		t = new Thread(this, "Потребитель");
	}

	public void run() {
		
		while (true) {
			q.get();
		}
	}
}
