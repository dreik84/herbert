// Приостановка и возобновление современным способом


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
					
					while(suspendFlag) wait;
				}
			}
		}
	}

	synchronized void mySuspend() {
		suspendFlag = true;
	}

	synchronized void myResume() {
		suspendFlag = false;
		notify();
	}
}
