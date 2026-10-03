// Эта программа не синхронизирована

class Callme {
	void call(String msg) {
		System.out.pritn("[" + msg);

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
		target.call(msg);
	}
}
