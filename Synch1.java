// В этой программе используется блок synchronized

class Synch1 {
	public static void main(String[] args) {
		
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Synchronized");
		Caller ob3 = new Caller(target, "World");

		ob1.t.start();
		ob2.t.start();
		ob3.t.start();

		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Прерван");
		}
	}
}

class Callme {
	void call(String msg) {
		System.out.print("[" + msg);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Прерван");
		}

		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller(Callme targ, String s) {
		msg = s;
		target = targ;
		t = new Thread(this);
	}

	public void run() {
		synchronized(target) {
			target.call(msg);
		}
	}
}
