// Автоматизированный светофор
class TrafficLightDemo {
	public static void main(String[] args) {
		TrafficLightSimulator tl = 
			new TrafficLightSimulator(TrafficLightColor.GREEN);
		Thread thrd = new Thread(tl);
		thrd.start();

		for (int i = 0; i < 9; i++) {
			System.out.println(tl.getColor());
			tl.waitForChange();
		}
		tl.cancel();
	}
}

// Перечисление цветов светофора
enum TrafficLightColor {
	RED, GREEN, YELLOW
}

class TrafficLightSimulator implements Runnable {
	private TrafficLightColor tlc; // хранит цвет светофора
	private boolean stop = false;  // устанавливается в true для остановки
	private boolean changed = false; // true, когда цвет изменился
	
	TrafficLightSimulator(TrafficLightColor init) {
		tlc = init;
	}

	TrafficLightSimulator() {
                tlc = TrafficLightColor.RED;
        }

	// Запустить имитацию работы светофора
	public void run() {
		while (!stop) {
			try {
				switch (tlc) {
					case GREEN:
						Thread.sleep(10000); // 10 секунд
						break;
					case YELLOW:
						Thread.sleep(2000); // 2 секунды
						break;
					case RED:
						Thread.sleep(12000); // 12 секунд
						break;
				}
			}
			catch (InterruptedException exc) {
				System.out.println(exc);
			}
			changeColor();
		}
	}

	// Изменить цвет
	synchronized void changeColor() {
		switch (tlc) {
			case RED:
				tlc = TrafficLightColor.GREEN;
				break;
			case YELLOW:
				tlc = TrafficLightColor.RED;
				break;
			case GREEN:
				tlc = TrafficLightColor.YELLOW;
				break;
		}
		changed = true;
		notify();  // сигнализировать об изменении цвета
	}

	// Ожидать, пока не произойдет изменение цвета светофора
	synchronized void waitForChange() {
		try {
			while (!changed) wait(); // ожидать изменения цвета	
			changed = false;
		}
		catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}

	// Возвратить текущий цвет
	synchronized TrafficLightColor getColor() {
		return tlc;
	}

	// Остановить имитацию светофора
	synchronized void cancel() {
		stop = true;
	}
}
